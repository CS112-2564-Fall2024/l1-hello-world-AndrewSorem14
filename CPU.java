public class CPU {

  // instance variable
    private String cpuName;

    // default constructor
    public CPU() {
      cpuName = "unknown";
    }

    // full constructor
    public CPU(String tempCPUName) {
      cpuName = tempCPUName;
    }

    // getters
    public String getCPUName(){
      return cpuName;
    }

    // setters
    public void setCPUName(String cpuName) {
        this.cpuName = cpuName;
      }

    //other methods
    public String toString() {
      return cpuName;
    }

    public boolean equals(CPU other) {
      return cpuName == other.cpuName;
    }
    
}
