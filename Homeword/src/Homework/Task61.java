package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        Map<Character, Integer> weights = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            if (i!=9){
                char letter = (char) ('a' + i);
                weights.put(letter, i + 1);
                char secondLetter = (char) ('l' + i);
                weights.put(secondLetter, (i + 1) * 10 + 10);
            }else {
                weights.put('k',10);
                weights.put('v',200);
            }

        }
        weights.put('x', 300);
        weights.put('y', 400);
        weights.put('z', 500);

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (weights.containsKey(word.charAt(i))) {
                sum += weights.get(word.charAt(i));
            }

        }
        System.out.println(sum);

    }
}