// Создать массив из 10 элементов. Заполните массив числами и вывести
// их в консоль(выводите через цикл for each).
//Замените каждый элемент с нечётным индексом на ноль. Выведите полученный
// массив в консоль через цикл for each.

package task6;

public class hw6_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 9, 6, 15, 7, 8, 3, 45, 24, 33};
        for (int i : array1) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 > 0) {
                array1[i] = 0;
            }
        }
        for (int i : array1) {
            System.out.print(i + ", ");
        }
    }
}
