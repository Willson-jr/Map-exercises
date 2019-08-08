package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        for (int i = 1; i <= numberOfTests; i++) {
            int maxNumber = scanner.nextInt();
            int divider = scanner.nextInt();
            int notDivider = scanner.nextInt();

            List<Integer> numbers = new ArrayList<>();
            for (int j = 1; j <= maxNumber; j++) {
                if (j % divider == 0 && j % notDivider != 0) {
                    numbers.add(j);
                }
            }
            for (int j = 0; j < numbers.size(); j++) {
                System.out.print(numbers.get(j)+" ");
            }
        }
    }

    public static List<Integer> divides(int n, int x, int y) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 1; j <= n; j++) {
            if (j % x == 0 && j % y != 0) {
                numbers.add(j);
            }
        }
        return numbers;
    }
}
