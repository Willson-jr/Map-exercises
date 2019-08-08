package Homework;

import java.util.Scanner;

public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static boolean divide(int x, int y){
        int g = x / y;
        if(g*y == x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            for(int j=0; j<n; ++j){
                if(divide(j,x) && !divide(j,y)){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
