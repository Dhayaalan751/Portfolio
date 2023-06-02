package Task.T12;

/*Creating two class ( demo1, demo2),Inside a demo1 class creating three method for( leap year implementation,
STDDEV method implementation,
Display user Details (Name, Age, Address,Phone number,Dept)),
 Inside a demo2 class creating a two method for (Switch Case Own Implementation using Static Method),
  static Implementation for (static varibale, final varibale and Inc/Dec Operator implementation)
 */

public class Demo1 {
    String Name;
    float Age;
    String Address;
    float Phnumber;
    String Dept;

    Demo1(String Name, float Age, String Address, float Phnumber, String Dept){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Phnumber = Phnumber;
        this.Dept = Dept;
    }

    static void leapYear(int n) {
        if(((n%4==0) && ((n%400==0) || (n%100!=0)))){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    static void stddev(double arr[],int n) {
        double sum = 0.0;
        double standardDeviation = 0.0;
        double mean;
        double res;
        double sq;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        mean = sum / (n);

        for (int i = 0; i < n; i++) {

            standardDeviation
                    = standardDeviation + Math.pow((arr[i] - mean), 2);

        }

        sq = standardDeviation / n;
        res = Math.sqrt(sq);
        System.out.println(res);

    }

    public String getName(){return Name;}
    public float getAge(){return Age;}
    public String getAddress(){return Address;}
    public float getPhnumber(){return Phnumber;}
    public String getDept(){return Dept;}

    public void display(){

        System.out.printf("%1s%15s%15s%15s%15s",getName(),getAge(),getAddress(),getPhnumber(),getDept());
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }


}