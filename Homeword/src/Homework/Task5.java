package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int countNumber = in.nextInt();
        for (int i = 0; i < countNumber; i++) {
            String str = in.next();
            String[] str2 = str.split("");
            List<String> str3 = new ArrayList();
            String current = null;
            String next = null;
            int count = 1;
            for (int j = 0; j < str2.length - 1; j++) {
                current = str2[j];
                next = str2[j + 1];
                if (current.equals(next)) {
                    count++;
                } else {
                    if (count >= 3) {
                        str3.add(current + count);
                    } else {
                        if (count == 2) {
                            str3.add(current);
                        }
                        str3.add(current);
                    }
                    count = 1;
                }
            }
            if (count >= 3) {
                str3.add(next + count);
            } else {
                if (count == 2) {
                    str3.add(next);
                }
                str3.add(next);
            }
            for (String word : str3) {
                System.out.print(word);
            }
        }
    }
}
