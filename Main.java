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

    CPU ryzen1 = new CPU("AMD", "7950X3D", 4.2);
    System.out.println(CPU.toString());
    
}
