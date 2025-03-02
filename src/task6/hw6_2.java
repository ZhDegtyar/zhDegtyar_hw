// Создать массив из 5 чисел и заполните этот массив вручную.
// Создайте второй массив с размерностью больше на 1 чем первый
//массив. Необходимо скопировать первый массив со всеми значениями
// во второй массив. Последний элемент во втором массиве пусть будет 0.
// Выведите второй массив в консоль с помощью цикла for each.

package task6;

public class hw6_2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 3;
        array1[1] = 5;
        array1[2] = 8;
        array1[3] = 22;
        array1[4] = 61;
        int[] array2 = new int[array1.length + 1];
        int i = 0;
        for (int number : array1) {
            array2[i] = number;
            i++;
        }

        for (int l : array2) {
            System.out.print(l + " ");
        }
    }
}

