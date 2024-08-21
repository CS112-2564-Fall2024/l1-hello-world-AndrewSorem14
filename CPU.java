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
