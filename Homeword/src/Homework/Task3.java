package Homework;

import java.util.Scanner;

public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int zestaw = in.nextInt();
        if (zestaw >= 1 && zestaw <= 20) {
            for (int i = 0; i < zestaw; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int candys = 0;
                if (x >= 10 && y <= 30) {
                    for (int j = 1; j < (x * y); j++) {
                        if (j % x == 0 && j % y == 0) {
                            candys = j;
                            break;
                        }
                    }
                }

                System.out.println(candys);
            }
        }

    }
}
