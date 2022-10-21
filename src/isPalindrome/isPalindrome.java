package isPalindrome;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word:");
        String word = scan.nextLine();
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a palindrome.");
        } else System.out.println(word + " is not a palindrome.");
    }
}
