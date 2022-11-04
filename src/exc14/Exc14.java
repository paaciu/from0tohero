package exc14;

import java.util.*;

import static java.lang.StrictMath.abs;

class Difference {
    private int element;
    private int[] elements;
    public int maximumDifference;

    Difference(
            int[] elements) {
        this.element = element;
        this.elements = elements;
        this.maximumDifference = maximumDifference;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = abs(elements[0] - elements[elements.length-1]);
    }
}

public class Exc14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
