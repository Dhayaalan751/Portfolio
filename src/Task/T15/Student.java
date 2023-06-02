package Task.T15;

public class Student  implements Cloneable{
    String name;
    int registerNumber;
    float mark1;
    float mark2;
    float mark3;
    String department;
    String college;
    void assigningOperator(String name, int registerNumber, float mark1, float mark2, float mark3, String department, String college) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.department = department;
        this.college = college;
    }

    public String getName() {
        return this.name;
    }

    public int getRegNo() {
        return this.registerNumber;
    }

    public float getMark1() {
        return this.mark1;
    }

    public float getMark2() {
        return this.mark2;
    }

    public float getMark3() {
        return this.mark3;
    }


    float getPercentage(float mark1, float mark2, float mark3) {
        float sum = mark1 + mark2 + mark3;
        float percentage = sum / 3;

        return percentage;
    }

    void display() {

        System.out.printf("%1s%15s%15s%15s%15s%15s%15s%15s", this.name, this.registerNumber,this.college,this.department, this.getMark1(), this.getMark2(), this.getMark3(), getPercentage(this.mark1,this.mark2,this.mark3) + "%");
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
