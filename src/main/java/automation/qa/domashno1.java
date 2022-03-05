package automation.qa;

import java.util.Scanner;

public class domashno1 {

    public static void main(String[] main) {

        System.out.print("Please enter your first name");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();

        System.out.print("Enter your last name");

        String lastName = scanner.nextLine();

        System.out.println("Enter your favorite hobby");

        String hobby = scanner.nextLine();

        System.out.println("Your first name is" + firstName + " and your last name" + lastName + " and your favorite hobby is " + hobby);
   }
 }