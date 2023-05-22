package home_work2;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {

        int arr[] = {10, -1, 0, 15, 2, 4, 7, -3, -4, 6, 0, 5, 12, -8};
        Array array = new Array(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если хотите отсортировать массив по возрастанию введите: 1\n" +
                "Если хотите отсортировать массив по убыванию введите: 2");
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> array.sortInc();
            case 2 -> array.sortDecr();
            default -> System.out.println("Ввели не то.");
        }

        array.printArray();
    }

    public static class Array {

            private int[] array;


            public Array(int[] arr) {
                this.array = arr;
            }

            public void sortInc() {
                Arrays.sort(this.array);
            }
            public void sortDecr(){
                for (int i = this.array.length-1; i >0; i--) {
                    for(int j=this.array.length-2; j >0; j--) {
                        if(this.array[j] > this.array[j -1]) {
                            int temp = this.array[j];
                            this.array[j] = this.array[j - 1];
                            this.array[j -1] =temp;
                        }
                    }
                }
            }

            public void printArray() {
                for (int el : this.array) {
                    System.out.print(el+" ");
                }
            }
    }
}

