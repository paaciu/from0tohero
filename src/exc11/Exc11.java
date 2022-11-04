package exc11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exc11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        System.out.println(arr);
        int sum = 0;
        int highestSum = 0;

//        for(int i =0; i<arr.size(); i++){
//            for(int number : arr.get(i)){
//                sum += number;
//                if (sum>highestSum){
//                    highestSum = sum;
//                }
//            }
//        }
        for(int i = arr.size()-1; i>=0; i--){
            if(arr.get(i).isEmpty()){
                break;
            } else {
                for(int number : arr.get(i)){
                    sum += number;
                    if (sum>highestSum){
                        highestSum = sum;
                        sum = 0;
                    }
                }
            }
        }
        System.out.println(highestSum);
        System.out.println(sum);
    }
}

