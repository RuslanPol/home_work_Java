package home_work2;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("Введите шестизначное число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 100000 || num > 999999) {
            while (num < 100000 || num > 999999) {
                System.out.println("Вы ввели не шестизначное число, попробуйте снова ");
                num = scanner.nextInt();
            }
        }
        int arr[] = new int[6];
        int k = 100000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (num - num % k) / k;
            num = num - arr[i] * k;
            k = k / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ((i == 0 && j == arr.length - 1) || (i == 1 && j == arr.length - 2)) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int res = 0;
        k = 100000;
        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i] * k;
            k = k / 10;
        }
        System.out.println(res);
    }
}

