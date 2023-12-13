import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {

//        count from 5 to 15
        int i = 5;
        while (i < 15) {
            i++;
            System.out.println(i);
        }

//        count by 2 up to 100
        int j = 0;
        do {
            System.out.println(j);
            j += 2;

        } while (j <= 100);
//      count backwards from 100 to -10 by 5s
        int k = 100;
        do{
            System.out.println(k);
            k -= 5;
        }while (k >= -10);

//        square 2 up to 1,000,000

        long number = 2;

        do {
            System.out.println(number);
            number *= number;
        } while (number < 1000000);

        for (int l = 5; l <= 15; l++) {
            System.out.println(l);
        }
        for (int m = 2; m <= 100; m+=2) {
            System.out.println(m);

        }


        for (long n = 2; n < 1000000; n*=n) {
            System.out.println(n);

        }



//      Create Fizz Buzz

        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println(a +" FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println(a +" Fizz");

            }else if (a % 5 == 0){
                System.out.println(a + " Buzz");
            } else {
                System.out.println(a);
            }

        }


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("What number would you like to go up to? ");
            int n = scanner.nextInt();

            System.out.println("\nHere is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int num = 1; num <= n; num++) {
                int squared = num * num;
                int cubed = num * num * num;
                System.out.printf("%-6d | %-7d | %-5d%n", num, squared, cubed);
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        char choice;

        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();
            char letterGrade;

            if (grade >= 88) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 67) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();

    }


}

