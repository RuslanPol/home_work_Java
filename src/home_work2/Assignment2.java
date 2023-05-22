package home_work2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = scanner.nextInt();
        System.out.println("Введите %, который необходимо посчитать:");
        double b = scanner.nextInt();
        if (b < 0) {
            while (b < 0) {
                System.out.println("Вы ввели отрицательное число, попробуйте снова");
                b = scanner.nextInt();
            }
        }
        double res = a * b / 100;
        System.out.println(b + "% от числа " + a + " = " + res);
    }
}