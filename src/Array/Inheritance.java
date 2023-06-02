package Array;

public class Inheritance {
    public static void main(String[] args) {
        Daughter obj = new Daughter();
        System.out.println(obj.gender);
    }
}
class GrandFather{
    char gender = 'M';
}
class Mother extends GrandFather{
    char gender = 'F';
}
class Daughter extends Mother{

}