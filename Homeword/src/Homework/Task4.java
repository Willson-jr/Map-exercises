package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String word = " ";
        while (!word.equals("")) {
            word = in.nextLine();
            System.out.println(reverse(word));
        }
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}


