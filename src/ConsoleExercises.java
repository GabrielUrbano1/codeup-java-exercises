import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.printf("the approximate value of pi is: %.2f%n", pi);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an Integer");
//
//        int userInput = scanner.nextInt();
//
//        System.out.printf("You entered %d%n", userInput);
//
//        System.out.println("Enter 3 words");
//
//        Scanner scanner2 = new Scanner(System.in);
//
//        String input1 = scanner2.next();
//        String input2 = scanner2.next();
//        String input3 = scanner2.next();
//
//        System.out.printf("your words are %n%s%n%s%n%s%n", input1, input2, input3);
//
//        Scanner scanner3 = new Scanner(System.in);
//
//        System.out.println("Enter a Sentence");
//
//        String userSentence = scanner3.nextLine();
//
//        System.out.printf("your sentence is: %n %s%n", userSentence);

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("length: ");

        double inputInt1 = scanner4.nextInt();
        System.out.println("Width: ");
        double inputInt2 = scanner4.nextInt();
        double area = inputInt1*inputInt2;
        double perimeter = 2 * (inputInt1+inputInt2);
        System.out.println("height: ");
        double height = scanner4.nextInt();
        double volumn = area * height;


        System.out.printf("The perimeter is: %s%n", perimeter);
        System.out.printf("The Area is: %s %n", area);
        System.out.printf("and the volumn is: %s %n", volumn);






    }
}
