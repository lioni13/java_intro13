package mat.qa;

import java.util.Scanner;

public class domashno3
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int a;
            int b;
            int c;
            System.out.println("Enter number a:");
            a = scanner.nextInt();
            System.out.println("Enter number b:");
            b = scanner.nextInt();
            System.out.println("Enter number c:");
            c = scanner.nextInt();

            if (a > b) {
                if (a > c) {
                    System.out.println("Number a is greatest");
                }
            } else if (b > c) {
                System.out.println("Number b is greatest");
            } else System.out.println("Number c is greatest");

            int length = 3;
            int high = 5;
            int perimeter = (2 * length) + (2 * high);
            int area = (length * high);
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("The area is: " + area);


            System.out.println("Please enter a number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else
                System.out.println("The number is odd");


            System.out.println("Enter number between 1 and 7");
            int enteredNumber = scanner.nextInt();
            switch (enteredNumber) {
                case 1:
                    System.out.println("The day is Monday");
                    break;
                case 2:
                    System.out.println("The day is Tuesday");
                    break;
                case 3:
                    System.out.println("The day is Wednesday");
                    break;
                case 4:
                    System.out.println("The day is Thursday");
                    break;
                case 5:
                    System.out.println("The day is Friday");
                    break;
                case 6:
                    System.out.println("The day is Saturday");
                    break;
                case 7:
                    System.out.println("The day is Sunday");
                    break;
                default:
                    System.out.println("False");
                    break;

            {

        }

