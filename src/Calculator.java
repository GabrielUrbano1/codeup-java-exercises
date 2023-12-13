import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //        creating the user input
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Hi there, would you like to add, subtract, multiply, or divide?");

            String userSelection = scanner.nextLine();

            if (userSelection.isEmpty()) {
                System.out.println("You have to make a selection");
            } else if (userSelection.equals("add")) {
                //      this is the addition portion
                Scanner addition = new Scanner(System.in);

                System.out.println("Pick a number to be added: ");

                int firstNumAdded = addition.nextInt();
                System.out.println("Pick a second number to be added: ");
                int secondNumAdded = addition.nextInt();

                int sum = firstNumAdded + secondNumAdded;

                System.out.printf("The sum of your numbers is: %s%n ", sum);

            } else if (userSelection.equals("subtract")) {
                //      this is the subtraction portion
                Scanner subtraction = new Scanner(System.in);

                System.out.println("Pick a number to be subtracted: ");
                int firstNumSubtracted = subtraction.nextInt();

                System.out.println("Pick a number to be subtracted: ");
                int secondNumSubtracted = subtraction.nextInt();

                int difference = firstNumSubtracted - secondNumSubtracted;
                System.out.printf("The difference is: %s%n ", difference);

            } else if (userSelection.equals("multiply")) {
                Scanner multiplication = new Scanner(System.in);

                System.out.println("Pick a number to multiply: ");
                long firstNumMultiplied = multiplication.nextInt();

                System.out.println("Pick a second number to be multiplied: ");
                long secondNumMultiplied = multiplication.nextInt();

                long product = firstNumMultiplied * secondNumMultiplied;
                System.out.printf("The Product of your two numbers is: %s%n ", product);

            } else if (userSelection.equals("divide")) {
                Scanner division = new Scanner(System.in);

                System.out.println("Pick a number to divide: ");
                long firstNumDivided = division.nextInt();

                System.out.println("Pick a second number to divide by: ");
                long secondNumDivided = division.nextInt();

                float quotient = (float) firstNumDivided / secondNumDivided;
                float remainder = firstNumDivided % secondNumDivided;
                System.out.printf("The Quotient of your two numbers is: %s%s%s ", quotient, " with a remainder of: ", remainder);

            } else {
                System.out.println("I do not recognize that request");
            }
            System.out.println("Would you like to do anything else? (Type 'yes' to continue and 'no' to end the conversation)");
            userSelection = scanner.nextLine();
            if (userSelection.equalsIgnoreCase("no")) {
                break;
            }
        } while(true);
    }
}
