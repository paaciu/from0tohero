import java.util.Scanner;

public class exc6 {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter a string:");
        while(newScan.hasNext())
        {
            String input = newScan.nextLine();
            if(!input.matches(".*\\d.*")) {
                char[] myCharArray = input.toCharArray();
                String result = "";
                String second_result = "";
                for (int i = 0; i < input.length(); i++) {
                    if (i % 2 != 0)
                        result = result + myCharArray[i];
                }

                for (int j = 0; j < input.length(); j++) {
                    if (j % 2 == 0)
                        second_result = second_result + myCharArray[j];
                }
                System.out.println(second_result + " " + result);
            }
        }
    }
}
