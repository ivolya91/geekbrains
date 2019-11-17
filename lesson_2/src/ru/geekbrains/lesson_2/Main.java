package ru.geekbrains.lesson_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        Scanner olya = new Scanner(System.in);
        int operation = olya.nextInt();
        System.out.println("Введите первое число");
        int a = olya.nextInt();
        System.out.println("Введите второе число");
        int b = olya.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Результат = " + result);
    }
}
