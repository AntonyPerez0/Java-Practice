package loops;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("The sum is: " + (num1 + num2));

            System.out.println("would you like to run again? false for no, true for yes: ");
            again = scanner.nextBoolean();
        } while (again);
    }
}
