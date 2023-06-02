package Task.T13;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class AesValidation {
    private static final String FACTORY_INSTANCE = "PBKDF2WithHmacSHA256";
    private static final String CIPHER_INSTANCE = "AES/CBC/PKCS5PADDING";
    private static final String SECRET_KEY_TYPE = "AES";
    private static final byte[] IV_CODE = new byte[16];
    private static final String SECRET_KEY = "yourSecretKey";
    private static final int ITERATION_COUNT = 65536;
    private static final int KEY_LENGTH = 256;
    public static String encrypt(String secretKey, String salt, String value) throws Exception {

        Cipher cipher = initCipher(secretKey, salt, Cipher.ENCRYPT_MODE);
        byte[] cipherText = cipher.doFinal(value.getBytes());
        byte[] cipherWithIv = addIVToCipher(cipherText);
        return Base64.getEncoder().encodeToString(cipherWithIv);
    }
    public static String decrypt(String secretKey, String salt, String encrypted) throws Exception {

        Cipher cipher = initCipher(secretKey, salt, Cipher.DECRYPT_MODE);
        byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));
        // unpad
        byte[] originalWithoutIv = Arrays.copyOfRange(original, IV_CODE.length, original.length);
        return new String(originalWithoutIv);
    }
    private static Cipher initCipher(String secretKey, String salt, int mode) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance(FACTORY_INSTANCE);
        KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), salt.getBytes(), ITERATION_COUNT, KEY_LENGTH);
        SecretKeySpec sKeySpec = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), SECRET_KEY_TYPE);
        Cipher cipher = Cipher.getInstance(CIPHER_INSTANCE);
        // Generating random IV
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV_CODE);
        cipher.init(mode, sKeySpec, new IvParameterSpec(IV_CODE));
        return cipher;
    }
    private static byte[] addIVToCipher(byte[] cipherText) {

        byte[] cipherWithIv = new byte[IV_CODE.length + cipherText.length];
        System.arraycopy(IV_CODE, 0, cipherWithIv, 0, IV_CODE.length);
        System.arraycopy(cipherText, 0, cipherWithIv, IV_CODE.length, cipherText.length);
        return cipherWithIv;
    }
    static String getString() {
        System.out.println("Enter the Name: ");
        Scanner scan = new Scanner(System.in);
        String Name;
        try {
            Name = scan.nextLine();
            for (int i = 0; i < Name.length(); i++)
                if (!(((Name.charAt(i) == 32) || (Name.charAt(i) >= 65 && Name.charAt(i) <= 90) || (Name.charAt(i) >= 97 && Name.charAt(i) <= 122)) && (Name.charAt(0) != 32))) {
                    throw new Exception();
                }

        } catch (Exception e) {
            System.out.println("Enter valid Name: ");
            String a = getString();
            return a;

        }
        return Name;
    }
    //Password should contain atleast 1 splchar, uppercase, number and no space charactersS
    static String getPassword(){
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Enter the password");
        n=sc.next();
        int ucount=0;
        int lcount=0;
        int spc=0;
        int nc=0;
        int s=0;
        try{
            if (n.toCharArray().length < 7) {
                throw new Exception();
            }
            else {
                for (int i = 0; i < n.length(); i++) {

                    if (Character.isUpperCase(n.charAt(i))) {
                        ucount++;
                    }
                    if (Character.isLowerCase(n.charAt(i))) {
                        lcount++;
                    }
                    if (Character.isDigit(n.charAt(i))) {
                        nc++;
                    }
                    if (Character.isSpaceChar(n.charAt(i))) {
                        s++;
                    } else {
                        spc++;
                    }
                }
                try{
                    if(ucount<1 || nc<1 || spc<1 || s>0){
                        throw new Exception();
                    }
                }
                catch (Exception e){
                    System.out.println("Password should contain atleast 1 splchar, uppercase, number and no space charactersS ");
                    n=getPassword();
                }
            }
        }
        catch(Exception e){
            System.out.println("Password  length should be 7");
            n=getPassword();
        }
        return n;
    }
    public static void main(String[] args) throws Exception {

        String fSalt = getString();
        String plainText = getPassword();
        String cipherText = encrypt(SECRET_KEY, fSalt, plainText);
        System.out.println("Cipher: " + cipherText);
        String decryptedText = decrypt(SECRET_KEY, fSalt, cipherText);
        System.out.println("Decrypted: " + decryptedText);
    }
}

