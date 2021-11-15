package com.pb.beida.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int array[] = new int[10];//создаем массив размером 10
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();// заполняем массив с клавиатуры
        }

        System.out.println("Заполненый массив");
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i]+ " ");// Выводим заполненый массив на экран
        }
        System.out.println();

        int num = 0;
        for (int i=0 ; i < array.length; i++){
            if (array[i] > 0 ){  // находим положительные элементы
                num++;
            }
        }
        System.out.println("Количество положительных элементов  =  "+ num);
    }
}