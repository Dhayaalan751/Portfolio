package Task.T25;

import java.io.File;

public class ListFiles {
    static void print(File[] arr, int level)
    {

        for (File f : arr) {

            for (int i = 0; i < level; i++)
                System.out.print("\t");

            if (f.isFile())
                System.out.println(f.getName());

            else if (f.isDirectory()) {
                System.out.println("[" + f.getName() + "]");
                print(f.listFiles(), level + 1);
            }
        }
    }


    public static void main(String[] args)
    {

        String path = "C:\\Users\\dhaya\\Documents\\Adobe";


        File maindir = new File(path);

        if (maindir.exists() && maindir.isDirectory()) {
            File arr[] = maindir.listFiles();

            System.out.println(
                    "************************************************");
            System.out.println(
                    "Files from main directory : " + maindir);
            System.out.println(
                    "************************************************");

            print(arr, 0);
        }
    }

}
