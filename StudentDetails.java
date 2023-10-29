import java.util.Scanner;

class Student {
    private String name;
    private int registerNumber;
    private double[] subjectMarks;

    public Student(String name, int registerNumber, double[] subjectMarks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;
    }

    public double calculateTotalMarks() {
        double total = 0;
        for (double mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverageMarks() {
        double total = calculateTotalMarks();
        return total / subjectMarks.length;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter register number: ");
        int registerNumber = scanner.nextInt();

        double[] subjectMarks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        Student student = new Student(name, registerNumber, subjectMarks);
        student.displayStudentDetails();
    }
}