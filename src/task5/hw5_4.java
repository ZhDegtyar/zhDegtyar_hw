//4*. Ввести число с консоли, которое не заканчивается на 0.
//Вывести чётные и нечётные числа через while and if. Использовать оператор %.

package task5;

import java.util.Scanner;

public class hw5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = in.nextInt();
        int result = 0;
        while (a > 0) {
            result = a % 10;
            if (result % 2 == 0) {
                System.out.println(result + " - четное");
            } else {
                System.out.println(result + " - нечетное");
            }
            a = a / 10;
        }
    }
}
