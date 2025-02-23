//3* . Ввести число с консоли, которое не заканчивается на 0.
//Вывести число в обратном порядке. Использовать оператор %. (цикл while,наподобие задачи, которую разбирали в конце занятия)

package task5;

import java.util.Scanner;

public class hw5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = in.nextInt();
        int result = 0;
        while (a > 0) {
            result = result * 10 + a % 10;
            a = a / 10;
        }
        System.out.println(result);
    }
}

