//2. На вход даны 3 числа. Вывести в консоль только те числа,
//которые делятся на 2 и на 5

package task4;

import java.util.Scanner;

public class hw4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("Введите третье число");
        int c = in.nextInt();
        if ((a % 2 == 0) && (a % 5 == 0)) {
            System.out.println("Число " + a + " делится на 2 и на 5");
        }
        if ((b % 2 == 0) && (b % 5 == 0)) {
            System.out.println("Число " + b + " делится на 2 и на 5");
        }
        if ((c % 2 == 0) && (c % 5 == 0)) {
            System.out.println("Число " + c + " делится на 2 и на 5");
        }
    }
}
