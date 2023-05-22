package home_work2;

public class Assignment9 {
    public static void main(String[] args) {
        int[] arr = {10, -1, 0, 15, 2, 4, 7, -3, -4, 6, 0, 5, 12, -8};
        int countNull = 0;
        int countPositive = 0;
        int countNegative = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countNull++;
            if (arr[i] < 0) countNegative++;
            if (arr[i] > 0) countPositive++;
        }
        System.out.println("В массиве элементов = 0: " + countNull);
        System.out.println("В массиве \"+\" элементов: " + countPositive);
        System.out.println("В массиве \"-\" элементов: " + countNegative);

    }

}