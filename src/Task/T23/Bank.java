package Task.T23;

abstract class Bank {
    abstract double rOIa();
}
class Sbia extends Bank{
    public double rOIa(){
        return 0.7;
    }
}
class Icicia extends Bank{
    public double rOIa(){
        return 0.8;
    }
}
class Centrala extends Bank{
    public double rOIa(){
        return 0.4;
    }
}
class Indiana extends Bank{
    public double rOIa(){
        return 0.6;
    }
}

