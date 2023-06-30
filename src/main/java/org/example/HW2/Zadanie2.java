//Задача 2:Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//        Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
//        c сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.


package org.example.HW2;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a, b;

        while (true) {
            try {
                System.out.print("Введите первое число - делимое: ");
                a = sc.nextLine();
                controlInputNumber(a);
                break;
            } catch (InvalidInputException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Введите второе число - делитель: ");
                b = sc.nextLine();
                controlInputNumber(b);
                controlZeroNumber(b);

                break;
            } catch (InvalidInputException | DivisionByZeroException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int answer = num1 / num2;

        System.out.println("Результат деления: " + answer);


    }

    public static void controlInputNumber(String value) throws InvalidInputException {
        if (value.trim().isEmpty()) {
            throw new InvalidInputException("Вы ввели пустое значение. Повторите ввод.");
        }
        int num;
        try {
            num = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Вы ввели значение неверного формата, введите числовое значение. Повторите ввод.");
        }

    }

    public static void controlZeroNumber(String value) throws DivisionByZeroException {

        int num;
        num = Integer.parseInt(value);
        if (num == 0) {
            throw new DivisionByZeroException("Делить на ноль нельзя, введите другое число");
        }
    }
}


class DivisionByZeroException extends Exception {
    DivisionByZeroException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}





