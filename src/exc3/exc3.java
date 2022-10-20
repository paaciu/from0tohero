package exc3;

import java.util.Scanner;

public class exc3 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer:");
        int y = scan.nextInt();
        System.out.println("Enter double:");
        double f = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter string:");
        String a = scan.nextLine();
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(i + y);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d + f);
        /* Print the sum of the double variables on a new line. */
        System.out.println(s + a);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}