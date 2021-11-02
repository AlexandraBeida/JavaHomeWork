package com.pb.beida.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int a = 50;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input x: ");
        int x = scanner.nextInt();
        System.out.println("input y: ");
        int y = scanner.nextInt();

        if (x > 0 && y < 14) {
           System.out.println("подходящий промежуток [0-14]");
        }
        if (a > 15 && a < 35){
            System.out.println("подходящий промежуток [15-35]");
        }
        if (a > 36 && a < 50){
            System.out.println("подходящий промежуток [36-50]");
        }
        if (a > 51 && a < 100){
            System.out.println("подходящий промежуток [51-100]");
        }
    }
}
