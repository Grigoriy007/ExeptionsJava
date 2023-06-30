//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
//        с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

package org.example.HW2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите число: ");
                int number = sc.nextInt();
                checkNumber(number);
                System.out.println("Число корректно");
                break;
            } catch (InvalidNumberException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void checkNumber(int num) throws InvalidNumberException {

        if (num == 0) {
            throw new InvalidNumberException("Положительное число не может быть равно нулю, введите число заново");
        }
        if (num < 0) {
            throw new InvalidNumberException("Положительное число не может быть меньше нуля, введите число заново");
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
