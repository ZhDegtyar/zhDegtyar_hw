//1. На вход даны 3 числа. Вывести в консоль только четные числа

        package task4;

import java.util.Scanner;

public class hw4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введиет а");
        int a = in.nextInt();
        System.out.println("Введиет b");
        int c = in.nextInt();
        System.out.println("Введиет c");
        int b = in.nextInt();
    if (a % 2 == 0) {
        System.out.println("Число а = " + a + " чётное");
    };
    if (b % 2 == 0) {
            System.out.println("Число b = " + b + " чётное");
        };
    if (c % 2 == 0) {
            System.out.println("Число c = " + c + " чётное");
        }
    }
}
