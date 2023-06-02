package Task.T7;

public class StudentDetails {
    private String name;
    private int regNo;
    private float mark1, mark2, mark3, mark4, mark5, total, average, percentage;

    StudentDetails(String name, int regNo,float mark1,float mark2,float mark3,float mark4,float mark5) {
        this.name = name;
        this.regNo = regNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;

    }

    public String getName() {
        return this.name;
    }
    public int getRegNo() {
        return this.regNo;
    }
    public float getMark1(){
        return this.mark1;
    }
    public float getMark2(){
        return this.mark2;
    }
    public float getMark3(){
        return this.mark3;
    }
    public float getMark4(){
        return this.mark4;
    }
    public float getMark5(){
        return this.mark5;
    }

    public float getTotal(){
        this.total=this.mark1+this.mark2+this.mark3+this.mark4+this.mark5;
        return this.total;
    }
    public float getAverage(){
        this.average=this.total/5;
        return this.average;
    }
    public float getPercentage(){
        this.percentage=(this.total/500)*100;
        return percentage;
    }




}
