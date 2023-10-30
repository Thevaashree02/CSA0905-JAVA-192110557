import java.util.Scanner;

class Studentasst {
    String name;

    public Studentasst(String name) {
        this.name = name;
    }
}

class Marks extends Studentasst {
    int marksPython;
    int marksCProgramming;
    int marksMathematics;
    int marksPhysics;

    public Marks(String name, int marksPython, int marksCProgramming, int marksMathematics, int marksPhysics) {
        super(name);
        this.marksPython = marksPython;
        this.marksCProgramming = marksCProgramming;
        this.marksMathematics = marksMathematics;
        this.marksPhysics = marksPhysics;
    }

    public int calculateTotal() {
        return marksPython + marksCProgramming + marksMathematics + marksPhysics;
    }
}

class Result extends Marks {
    public Result(String name, int marksPython, int marksCProgramming, int marksMathematics, int marksPhysics) {
        super(name, marksPython, marksCProgramming, marksMathematics, marksPhysics);
    }

    public void calculateAggregateAndDisplayGrade() {
        int totalMarks = calculateTotal();
        double aggregate = totalMarks / 4.0;

        System.out.println("Total= " + totalMarks);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();

        System.out.print("Enter the marks in Python: ");
        int marksPython = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        int marksCProgramming = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        int marksMathematics = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        int marksPhysics = scanner.nextInt();

        Result studentResult = new Result(name, marksPython, marksCProgramming, marksMathematics, marksPhysics);
        studentResult.calculateAggregateAndDisplayGrade();
    }
}
