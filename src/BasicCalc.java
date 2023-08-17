import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        // 1. Declare and initialize variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        // 2. Perform arithmetic operations
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");


        int choice = input.nextInt();
        int result = 0;
        // 3. Get user input
        if(choice == 1) {
            result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (choice == 4) {
            result = num1 / num2;
            System.out.println("The quotient is: " + result);
        } else {
            System.out.println("Invalid choice");

        }
    }


}
