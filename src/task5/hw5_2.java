//2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого. (Используйте цикл
//while). Подсказка. До цикла объявите переменную int sum=0. Всамом цикле перезаписывайте в эту переменную сумму чисел.

package task5;

import java.util.Scanner;

public class hw5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();

        int sum = 0;
        while (a <= b){
            sum = sum + a;
            a++;
        }

        System.out.println(sum);
    }
}
