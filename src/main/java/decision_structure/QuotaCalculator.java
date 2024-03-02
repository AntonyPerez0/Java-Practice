package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        int quota = 10;

        System.out.println("Enter the number of sales made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congratulations! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Sorry, you did not meet your quota. " + "You were " + salesShort + " sales short.");
        }
    }
}
