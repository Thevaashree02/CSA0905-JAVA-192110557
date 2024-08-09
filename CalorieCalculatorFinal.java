import java.util.*;

public class CalorieCalculatorFinal {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        // Keep running the program until the user decides to exit
        do {
            System.out.println("Welcome to the Calorie Calculator!");

            System.out.print("Enter your gender (M/F): ");
            char gender = s.next().charAt(0);

            System.out.print("Enter your age: ");
            int age = s.nextInt();

            System.out.print("Enter your height in centimeters: ");
            double height = s.nextDouble();

            System.out.print("Enter your current body weight in kilograms: ");
            double currentWeight = s.nextDouble();

            System.out.print("Enter your goal body weight in kilograms: ");
            double goalWeight = s.nextDouble();

            System.out.print("Enter your activity level (1- Sedentary, 2- Lightly active, 3- Moderately active, 4- Very active, 5- Extremely active): ");
            int activityLevel = s.nextInt();

            System.out.print("Do you want to calculate a (D)eficit or (S)urplus? ");
            char choice = s.next().charAt(0);

            double bmr = calculateBMR(gender, age, height, currentWeight);

            double tdee = calculateTDEE(bmr, activityLevel);

            double calorieDifference = 0.0;
            if (choice == 'D' || choice == 'd') {
                calorieDifference = tdee - calculateTDEE(gender, age, height, goalWeight, activityLevel);
            } else if (choice == 'S' || choice == 's') {
                calorieDifference = calculateTDEE(gender, age, height, goalWeight, activityLevel) - tdee;
            } else {
                System.out.println("Invalid choice. Please enter 'D' or 'S'.");
                continue; // Restart the loop
            }

            // Adjusted code for even faster weight change
            double weightChangePerWeek = calorieDifference / 275; // 500 calories ≈ 0.05 kg

            int weeksToGoal = (int) Math.ceil(Math.abs(currentWeight - goalWeight) / Math.abs(weightChangePerWeek));

            // Print the results in a table format
            System.out.println("\nResults:");
            System.out.printf("|        %-25s | %-15.2f |\n", "Calories to eat per day", tdee);
            System.out.printf("|        %-25s | %-15.2f |\n", "Calorie " + ((choice == 'D' || choice == 'd') ? "deficit" : "surplus"), calorieDifference);
            System.out.printf("|        %-25s | %-15.2f |\n", "Weight change per week", weightChangePerWeek);
            System.out.printf("| %-25s | %-15d |\n", "No.of weeks to reach goal weight", weeksToGoal);

            // Ask the user if they want to run the program again
            System.out.print("\nDo you want to run the program again? (Y/N): ");
            char runAgain = s.next().charAt(0);

            if (runAgain != 'Y' && runAgain != 'y') {
                break; // Exit the loop if the user decides not to run the program again
            }

        } while (true); // Infinite loop to keep running the program

        s.close();
    }

    private static double calculateBMR(char gender, int age, double height, double weight) {
        if (gender == 'M') {
            return 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else if (gender == 'F') {
            return 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        } else {
            throw new IllegalArgumentException("Invalid gender");
        }
    }

    private static double calculateTDEE(double bmr, int activityLevel) {
        double[] activityMultipliers = {1.2, 1.375, 1.55, 1.725, 1.9};
        return bmr * activityMultipliers[activityLevel - 1];
    }

    private static double calculateTDEE(char gender, int age, double height, double weight, int activityLevel) {
        return calculateTDEE(calculateBMR(gender, age, height, weight), activityLevel);
    }
}