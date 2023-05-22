package home_work2;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 9: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите целое число от 1 до 9: ");
        int num2 = scanner.nextInt();
        int count;
        int n = 1;
        System.out.println("таблица:\n");
        if (num1 > num2) {
            count = num1 - num2 + 1;
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = num2;
                for (int j = 0; j <10; j++) {
                    int res = arr[i] * n;
                    System.out.println(arr[i] + " " + "*" + " " + n + " = " + res);
                    n++;
                }
                num2++;
                n=1;
                System.out.println("\n");
            }
        } else {
            count = num2 - num1 + 1;
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = num1;
                for (int j = 0; j <10; j++) {
                    int res = arr[i] * n;
                    System.out.println(arr[i] + " " + "*" + " " + n + " = " + res);
                    n++;
                }
                num1++;
                n=1;
                System.out.println("\n");
            }
        }
    }
}
