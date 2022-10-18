import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class exc5 {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double meal_tipped = meal_cost * tip_percent / 100;
        double meal_taxed = meal_cost * tax_percent / 100;
        double total = meal_cost + meal_tipped + meal_taxed;
        System.out.println(Math.round(total));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        exc5.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}