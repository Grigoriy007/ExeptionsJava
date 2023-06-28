package org.example.HW1;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        exceptionAge();
    }


    public static void exceptionAge() {
        System.out.print("Введите свой возраст: ");
        Scanner sc = new Scanner(System.in);
        try {
            String userInp = sc.nextLine();
            int age = Integer.parseInt(userInp);
            if (age > 0){
                System.out.println("Возраст, который вы ввели: " + age);
            }
            else {
                System.out.println("Пожалуйста введите положительное число");
                exceptionAge();
            }

        }catch (NumberFormatException e){
            System.out.println("Неверный ввод");
            exceptionAge();
        }
    }
}
