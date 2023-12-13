import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob: Hi there! What do you want to say to Bob?");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else {
                System.out.println("Bob: Whatever.");
            }

            System.out.println("Bob: Anything else? (Type 'exit' to end the conversation)");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }

        System.out.println("Bob: Goodbye!");
        scanner.close();
    }
}
