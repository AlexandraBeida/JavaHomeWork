package com.pb.beida.hw3;

import java.util.Scanner;
import java.lang.Math;

public class Bingo {
    public static void main(String[] args) {
        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Угадать число (от 0 до 100).");
        UnknownNumber = (int) Math.floor(Math.random() * 100);
        do {
            TrysCount++;
            System.out.print("Введите ваше число: ");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber)
                System.out.println("Моё число меньше.");
            else if (UserNumber < UnknownNumber) System.out.println("Моё число больше.");
            else System.out.println("Вы угадали!");
        } while (UserNumber != UnknownNumber);
        System.out.println("Количество попыток: " + TrysCount);
    }
}