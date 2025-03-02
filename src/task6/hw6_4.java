//Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив.
// Выполнить с помощью цикла for

package task6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class hw6_4 {
    public static void main(String[] args) {
        int [] array = {15, 6, 78, 11, 26};
        Arrays.sort(array);
        System.out.print("[");
        for (int values : array) {
            System.out.print(values + ", ");
        }
        System.out.println("]");
    }
}
