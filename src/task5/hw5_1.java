//1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)

package task5;

public class hw5_1 {
    public static void main(String[] args) {
        int x;
        for (x = 1; x <= 100; x++) {
            if ((x % 7 == 0) || (x % 3 == 0)) {
                System.out.print(x + "; ");
            }
        }
    }
}
