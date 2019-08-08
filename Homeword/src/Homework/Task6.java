package Homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Map<String,Integer> letter = new LinkedHashMap<>();
        letter.put("A",1);
        letter.put("B",2);
        letter.put("C",3);
        letter.put("D",4);
        letter.put("E",5);
        letter.put("F",6);
        letter.put("G",7);
        letter.put("H",8);
        letter.put("I",9);
        letter.put("K",10);
        letter.put("L",20);
        letter.put("M",30);
        letter.put("N",40);
        letter.put("O",50);
        letter.put("P",60);
        letter.put("Q",70);
        letter.put("R",80);
        letter.put("S",90);
        letter.put("T",100);
        letter.put("V",200);
        letter.put("X",300);
        letter.put("Y",400);
        letter.put("Z",500);

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] str2 = word.split("");
        String current = null;
        Integer sum = 0;
        for (int i = 0; i < str2.length; i++) {
            current = str2[i];
            current = current.toUpperCase();
            sum += letter.get(current);
        }
        System.out.println(sum);

    }
}
