package Homework;

import java.util.Scanner;

public class Task51 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String word = in.nextLine() + '!';
            char last = word.charAt(0);
            int count = 1;
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) == last) {
                    count++;
                } else {
                    System.out.println(last);
                    if (count != 1 && count != 2) {
                        System.out.println(count);
                    }
                    if (count == 2) {
                        System.out.println(last);
                    }
                    last = word.charAt(j);
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
