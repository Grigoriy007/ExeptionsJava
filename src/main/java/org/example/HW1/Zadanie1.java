package org.example.HW1;

public class Zadanie1 {
    public static void main(String[] args) {
        exceptionDivide(5, 0);

    }

    public static void exceptionDivide(int a, int b){
        try {
            int result = a / b;
            System.out.println("Результат: " + result);

        }catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        catch (Throwable e) {
            System.out.println("Вы ввели недопустимый символ, введите число");
        }
    }
}
