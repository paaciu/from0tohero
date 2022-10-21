package exc7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exc7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> clist = new ArrayList<>();
        int n= input.nextInt();

        for(int i = 0; i<n; i++){
            clist.add(input.nextInt());
        }
        Collections.reverse(clist);

        for (int i : clist) {
            System.out.print(i + " ");
        }

    }
}