public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
    }

    public static void welcomeMSG() {
        System.out.println("Welcome to GitHub!");
    }

    public static double GPA(double grade1, double grade2, double grade3, double grade4) {
        double GPA = (grade1 + grade2 + grade3 + grade4) / 4.0;
        return GPA;
    }

    CPU Ryzen1 = new CPU("AMD", "7950X3D", 4.2);
    System.out.println(CPU.toString());
    
}

public class CPU {

    //instance variables
    private String company;
    private String cpuName;
    private double speed;

    //getters
    public String getCompany(){
      return company;
    }
    public String getCPUName(){
      return cpuName;
    }
    public double getSpeed(){
      return speed;
    }

    //setters
    public void setCompany(String company) {
        this.company = company;
    }
    public void setCPUName(String cpuName) {
        this.cpuName = cpuName;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //other methods
    public String toString() {
      return  String.format("Company: %s\nCPU Name: %s\nCPU Speed: %0.2f", company, cpuName, speed);
    }

    public boolean equals(CPU other) {
      return (company == other.company && cpuName == other.cpuName && speed == other.speed);
    }
    
}
