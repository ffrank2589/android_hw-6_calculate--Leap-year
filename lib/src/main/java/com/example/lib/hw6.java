package com.example.lib;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args){
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println(":");
        y = scanner.nextInt();
        if (y % 4 == 0)
            System.out.println("t");
        else
            System.out.println("f");
    }
}
