import java.util.Scanner;
class A6_EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();
        double bonus = calculateBonus(grade, salary);

        double totalSalary = salary + bonus;

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid: " + totalSalary);
        scanner.close();
    }

    private static double calculateBonus(char grade, double salary) {
        double bonusPercentage;

        if (grade == 'A') {
            bonusPercentage = 0.05; 
        } else if (grade == 'B') {
            bonusPercentage = 0.10; 
        } else {
            throw new IllegalArgumentException("Invalid grade. Please enter A or B.");
        }
        if (salary < 10000) {
            bonusPercentage += 0.02;
        }
        return salary * bonusPercentage;
    }
}