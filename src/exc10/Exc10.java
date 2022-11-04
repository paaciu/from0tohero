package exc10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args){
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int n = 0;
        while(inputNumber>0){
            n = inputNumber%2;
            inputNumber = inputNumber/2;
            integerList.add(n);
        }

        System.out.println(integerList);
        int j = 0;
        int max = 0;

        for(int i = 0; i < integerList.size(); i++){
            if(integerList.get(i)==0){
                    j = 0;
                } else j++;
            if(j>max){
                max = j;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
