//3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления. Написать программу,
// которая будет выводит разный текст, в зависимости от значения result. В случае result=3, вывести: "Результат деления равен 3"
// В случае result=5вывести: "Результат деления равен 5" В других случаях вывести: результат деления (использовать приведение типов) Для выполнения
//задания использовать оператор switch- case.

package task4;

import java.util.Scanner;

public class hw4_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число х");
        int x = in.nextInt();
           double result = (double) 15 / x;
        switch ((int)result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат = " + (result));
        }


    }
}


