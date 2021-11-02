package com.pb.beida.hw2;

public class Interval {
    public static void main(String[] args) {
        int a = 50;
        if (a >= 0 && a <= 14) {
           System.out.print("Это подходящий промежуток [0-14]");
        } else {
            System.out.print("Промежуток [0-14] не подходит");
        }
        if (a >= 15 && a <= 35){
            System.out.print("Это подходящий промежуток [15-35]");
        } else {
            System.out.print("Промежуток [15-35] не подходит");
        }
        if (a >= 36 && a <= 50){
            System.out.println("Это подходящий промежуток [36-50]");
        } else {
            System.out.print("Промежуток [36-50] не подходит");
        }
        if (a >= 51 && a <= 100){
            System.out.println("Это подходящий промежуток [51-100]");
        } else {
            System.out.print("Промежуток [51-100] не подходит");
        }
    }
}
