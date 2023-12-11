import java.util.Scanner;
//
////this is a java object. all the code will go inside this.
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//
//        int myFavoriteNumber = 7;
//        String myString = "Gabriel";
//
//        System.out.println("My favorite number is:" + myFavoriteNumber);
//        System.out.println("Hello " + myString);
//
//        // Change myString to assign a character value
//        // This will result in a compilation error because a char cannot be assigned to a String
//
//        myString = "3.14159";
//        System.out.println(myString);
//
//
//        long myNumber = 123L;
//
//        System.out.println(myNumber);
//
//        // Assigning the value 3.14 to a variable declared as a long does not compile because
//        // 3.14 is treated as a double by default, and you cannot assign a double to a long without an explicit cast.
//        // float myNumber = 3.14f;
//
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);
//
//        Scanner scanner = new Scanner(System.in);
////
//        System.out.print("Enter three words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println("You entered:");
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//        scanner.nextLine(); // Consume the newline character
//
//
//
//
//
//        double pi = 3.14159;
//
//        System.out.format("Pi is = to: " + pi);
//
//        Scanner num = new Scanner(System.in);
//
//
//        System.out.print("Input the length");
//
//        int numA = num.nextInt();
//
//        System.out.print("Input the width");
//        int numB = num.nextInt();
//
//        System.out.println("The total perimeter is: " + (numA*2+numB*2));
//        System.out.println("The total area is: " +(numA*numB) );
//
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        // Task 1: Create an int variable and print it
//        int myFavoriteNumber = 42;
//        System.out.println("My favorite number is: " + myFavoriteNumber);
//
//        // Task 2: Create a String variable and print it
//        String myString = "Hello, World!";
//        System.out.println("myString: " + myString);
//
//        // Task 3: Try to assign a character value to myString
//        // This will result in a compilation error
//        // myString = 'A';
//
//        // Task 4: Assign a double value to myString
//        myString = "3.14159";
//        System.out.println("myString: " + myString);
//
//        // Task 5: Declare a long variable and try to print it
//        // This will result in a compilation error
//        // long myNumber;
//        // System.out.println("myNumber: " + myNumber);
//
//        // Task 6: Assign a double value to myNumber
//        // This will result in a compilation error
//        // myNumber = 3.14;
//
//        // Task 7: Assign a long value to myNumber
//        myNumber = 123L;
//        System.out.println("myNumber: " + myNumber);
//
//        // Task 8: Assign an integer value to myNumber
//        myNumber = 123;
//        System.out.println("myNumber: " + myNumber);
//
//        // Task 9: Why does assigning 3.14 to a long not compile?
//        // 3.14 is treated as a double by default, and you cannot assign a double to a long without a cast.
//
//        // Task 10: Declare myNumber as a float and assign 3.14 to it
//        float myNumber = 3.14f;
//        System.out.println("myNumber: " + myNumber);
//
//        // Task 11: Code blocks with increment operators
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);
//
//        // Task 12: Trying to create a variable named 'class'
//        // This will result in a compilation error as 'class' is a reserved keyword
//
//        // Task 13: Casting a String to int using Object
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        // This will result in a ClassCastException at runtime
//
//        // Task 14: How is the above example different from this code block?
//        // The difference is in the type of error:
//        // In the above example, it's a runtime error (ClassCastException).
//        // In this example, it's a compilation error because you're trying to cast a String literal directly to int.
//        // int three = (int) "three";
//
//        // Task 15: Two different types of errors observed are ClassCastException and compilation error.
//
//        // Task 16: Shorthand assignment operators
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
//        // Task 17: Overflow and underflow
//        int maxInt = Integer.MAX_VALUE;
//        System.out.println("Max int: " + maxInt);
//        maxInt++;
//        System.out.println("Max int + 1: " + maxInt);
//    }
//}



//public class HelloWorld {
//    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        // Display pi value with 2 decimal places
//        System.out.format("The value of pi is approximately %.2f.%n", pi);
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt for an integer input
//        System.out.print("Enter an integer: ");
//        int integerInput = scanner.nextInt();
//        System.out.println("You entered: " + integerInput);
//
//        // Clear the newline character left in the buffer
//        scanner.nextLine();
//
//        // Prompt for 3 words
//        System.out.print("Enter three words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println("You entered: ");
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//
//        // Prompt for a sentence using next method
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
//        System.out.println("You entered: " + sentence);
//
//        // Clear the newline character left in the buffer
//        scanner.nextLine();
//
//        // Prompt for a sentence using nextLine method
//        System.out.print("Enter a sentence: ");
//        String sentenceLine = scanner.nextLine();
//        System.out.println("You entered: " + sentenceLine);
//
//        // Calculate area and perimeter of a classroom
//        System.out.print("Enter the length of the classroom: ");
//        double length = Double.parseDouble(scanner.nextLine());
//        System.out.print("Enter the width of the classroom: ");
//        double width = Double.parseDouble(scanner.nextLine());
//
//        double area = length * width;
//        double perimeter = 2 * (length + width);
//        double volume = area * 10; // Assume a height of 10 for volume
//
//        System.out.println("The area of the classroom is: " + area);
//        System.out.println("The perimeter of the classroom is: " + perimeter);
//        System.out.println("The volume of the classroom is: " + volume);
//
//        scanner.close();
//
//
//    }
//}

