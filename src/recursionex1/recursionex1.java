package recursionex1;

import java.util.Scanner;

public class recursionex1 {

    static int recursion(int n){
        if(n <= 2)
            return 1;
        else
            return(n+recursion(n-1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        while(!sc.hasNextInt()){
            System.out.println("Please enter an integer.");
            int f = sc.nextInt();
        }
        int n = sc.nextInt();
        int result = recursion(n);
        System.out.println(result);
    }
}
