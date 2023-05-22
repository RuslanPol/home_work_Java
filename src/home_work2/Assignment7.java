package home_work2;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int num2 = scanner.nextInt();
        int count;
        System.out.println("Нечетные числа:\n");
        if (num1 > num2) {
            count = num1 - num2 + 1;
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = num2;
                num2++;
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        } else {
            count = num2 - num1 + 1;
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = num1;
                num1++;
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
