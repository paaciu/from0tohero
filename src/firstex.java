import java.util.Scanner;

public class firstex {

    public static void main(String[] args){
        System.out.println("This programme is going to check if numbers you enter are equal.");
        System.out.println("Please, enter first number:");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.println("Please, enter second number:");
        int second = in.nextInt();
        System.out.println("Please, enter third number:");
        int third = in.nextInt();
        if (first == second && second == third){
            System.out.println("Entered numbers are equal.");
        } else{
            System.out.println("Entered numbers are not equal.");
        }
    }

}
