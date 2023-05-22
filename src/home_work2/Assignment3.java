package home_work2;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 9: ");
        int a = scanner.nextInt();
        if (a == 0) {
            while (a == 0) {
                System.out.println("Попробуйте снова введите цифру от 1 до 9");
                a = scanner.nextInt();
            }
        }
        System.out.println("Введите цифру: ");
        int b = scanner.nextInt();
        System.out.println("Введите цифру: ");
        int c = scanner.nextInt();
        int res = a * 100 + b * 10 + c;
        System.out.println("Получилось число: " + res);
    }
}
