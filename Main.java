public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        welcomeMSG();

        CPU ryzen1 = new CPU();
        ryzen1.setCPUName("Ryzen 9 7950X3D");
        CPU ryzen2 = new CPU(ryzen1.getCPUName());

        System.out.println(ryzen1.toString());

        if (ryzen1.equals(ryzen2)) {
            System.out.println("These CPU's match!");
        } else {
            System.out.println("These CPU's do not match!");
        }

    }

    public static void welcomeMSG() {
        System.out.println("Welcome to GitHub!");
    }

    public static double GPA(double grade1, double grade2, double grade3, double grade4) {
        double GPA = (grade1 + grade2 + grade3 + grade4) / 4.0;
        return GPA;
    }
    
}
