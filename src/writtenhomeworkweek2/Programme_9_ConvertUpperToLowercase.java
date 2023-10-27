package writtenhomeworkweek2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowercase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase String : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowercase p = new Programme_9_ConvertUpperToLowercase();
        p.convertUppercaseToLowercase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //conversion of Uppercase to Lower case method
    public void convertUppercaseToLowercase(String text) {
        System.out.println("The Lowercase value is : " + text.toLowerCase());
    }
}
