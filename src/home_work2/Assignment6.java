package home_work2;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние в метрах");
        float distance = scanner.nextFloat();
        System.out.println("Перевести метры в :\nмили введите 1\nярды введите 2\nдюймы введите 3");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("В " + distance + " метрах " + (distance * 0.00062137) + " миль");
            }
            case 2 -> {
                System.out.println("В " + distance + " метрах " + (distance * 1.0936) + " ярдов");
            }
            case 3 -> {
                System.out.println("В " + distance + " метрах " + (distance * 39.37) + " дюймов");
            }
            default -> System.out.println("нет такого варианта");
        }
    }
}
