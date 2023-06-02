package Task.T22;

public interface Bank {
    double rOI();
}
class Sbi implements Bank {
    public double rOI(){
        double rOI= 0.5;
        return rOI;
    }
}
class Icici implements Bank {
    public double rOI(){
        double rOI = 0.6;
        return rOI;
    }
}
class Indian implements Bank {
    public double rOI(){
        double rOI = 0.8;
        return rOI;
    }
}
class Central implements Bank {
    public double rOI(){
        double iOI = 0.7;
        return iOI;
    }
}


