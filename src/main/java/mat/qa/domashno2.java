package mat.qa;

import java.util.Scanner;

public class domashno2 {
    public static void main(String[] args) {
        String myName = "My name is <myName>";

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String replacedName = myName.replace("<myName>", scanner.nextLine());

        System.out.println("replacedname" + ".");

        System.out.println("Enter your shortName");
        String shortName = scanner.nextLine();

        System.out.println("Name equal shortName? - " + replacedName.equals(shortName));

        String [] wordCountArray = replacedName.split(" ");

        System.out.println('\"' + replacedName + '\"' + " has " + wordCountArray.length + " words.");

        String yourName = "What is your name? \n" ;

        System.out.println(yourName + replacedName + " and my shortName is " + shortName + ".");
    }
}
