package home_work2;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        if (month < 0 || month > 12) {
            while (month < 0 || month > 12) {
                System.out.println("Таких месяцев не бывает, попробуйте еще раз");
                month = scanner.nextInt();
            }
        }

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("It's Winter now");
        }
        if (2 < month && month < 6) {
            System.out.println("It's Spring now");
        }
        if (5 < month && month < 9) {
            System.out.println("It's Summer now");
        }
        if (8 < month && month < 12) {
            System.out.println("It's Summer now");
        }


    }
}
