import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test basic arithmetic methods
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(10, 4));
        System.out.println("Multiplication: " + multiply(6, 7));
        System.out.println("Division: " + divide(20, 4));

        // Test modulus method
        System.out.println("Modulus: " + modulus(15, 7));

        // Test multiplication without * operator
        System.out.println("Multiplication without * operator: " + multiplyWithoutOperator(5, 4));

        // Test getInteger method
        int userInput = getInteger(scanner, 1, 10);
        System.out.println("User entered: " + userInput);

        // Test factorial method
        long factorialResult = calculateFactorial(scanner);
        System.out.println("Factorial: " + factorialResult);

        // Test dice rolling simulation
        simulateDiceRolling(scanner);

        // Test high-low guessing game
        playHighLowGame(scanner);

        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            throw new ArithmeticException("Cannot calculate modulus with zero divisor");
        }
    }

    public static int multiplyWithoutOperator(int a, int b) {
        int result = 0;
        boolean negative = false;

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            negative = true;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return negative ? -result : result;
    }

    public static int getInteger(Scanner scanner, int min, int max) {
        int userInput;
        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static long calculateFactorial(Scanner scanner) {
        int userInput;
        do {
            System.out.print("Enter an integer between 1 and 10: ");
            userInput = scanner.nextInt();
        } while (userInput < 1 || userInput > 10);

        long factorial = 1;
        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void simulateDiceRolling(Scanner scanner) {
        System.out.print("Enter the number of sides for a pair of dice: ");
        int sides = scanner.nextInt();

        do {
            int result1 = rollDice(sides);
            int result2 = rollDice(sides);
            System.out.println("Dice 1: " + result1);
            System.out.println("Dice 2: " + result2);

            System.out.print("Roll again? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        } while (true);
    }

    public static int rollDice(int sides) {
        return (int) (Math.random() * sides) + 1;
    }

    public static void playHighLowGame(Scanner scanner) {
        int randomNumber = generateRandomNumber(1, 100);
        int numberOfGuesses = 0;
        final int maxGuesses = 10;

        System.out.println("\nWelcome to the High-Low Guessing Game!");

        while (numberOfGuesses < maxGuesses) {
            System.out.print("Guess the number (1-100): ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                System.out.println("You guessed the number in " + numberOfGuesses + " attempts.");
                break;
            }

            if (numberOfGuesses == maxGuesses) {
                System.out.println("Sorry, you've reached the maximum number of guesses. The number was " + randomNumber + ".");
            }
        }
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
