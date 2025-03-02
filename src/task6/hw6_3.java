//Создать массив вручную. Заменить максимальный
//и минимальный элемент массива. Новый минимальный элемент будет (-1000), новый максимальный элемент 1000

package task6;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class hw6_3 {
    public static void main(String[] args) {
        int[] array1 = {25, 158, 6, 26, 754, 90};
        int max=array1[0];
        int min=array1[0];
        int maxIndex =0;
        int minIndex =0;
        for (int i=0; i< array1.length; i++){
            if(array1[i] >= max){
                max = array1[i];
                maxIndex = i;
            }
            if (array1[i]<= min){
                min=array1[i];
                minIndex=i;
            }
        }
        array1[minIndex]=-1000;
        array1[maxIndex]=1000;
        System.out.println(Arrays.toString(array1));
       /* int max = MIN_VALUE;
        int i;
        for (i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);
        for (i = 0; i < array1.length; i++) {
            if (array1[i] == max) {
                array1[i] = 1000;
            }
        }
        System.out.println(Arrays.toString(array1));
    }*/
    }}
