package com.pb.beida.hw2;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 20;
        char sign = 'D';

        switch (sign) {
            case 'A':
                System.out.println("Сложение = " + (operand1 + operand2) + " Отлично!");
                break;
            case 'B':
                System.out.println("Вычетание = " + (operand1 - operand2) + " Отлично!");
                break;
            case 'C':
                System.out.println("Умножение = " + (operand1 * operand2) + " Отлично!");
                break;
            case 'D':
                System.out.println("Деление = " + (operand2 / operand1) + " Отлично!");
                break;
        }
    }
}
