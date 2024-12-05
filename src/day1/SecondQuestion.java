package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondQuestion {

    public static void main(String[] args) {
        String input = Main.input;
        String[] lines = input.split("\n");
        List<Integer> list1 = new ArrayList<>();
        Map<Integer, Integer> appearsInSecondList = new HashMap<>();
        for (String line : lines) {
            String[] numbers = line.split("   ");
            list1.add(Integer.parseInt(numbers[0]));
            int number2 = Integer.parseInt(numbers[1]);
            int currentCount = appearsInSecondList.getOrDefault(number2, 0);
            appearsInSecondList.put(number2, currentCount + 1);
        }
        int similarityScore = 0;
        for (int x : list1) {
            similarityScore += x * appearsInSecondList.getOrDefault(x, 0);
        }
        System.out.println(similarityScore);
    }

}
