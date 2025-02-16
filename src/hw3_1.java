//1. Дано уравнение x/6+25=98. Найти x и вывести его в консоль

public class hw3_1 {
    public static void main(String[] args) {
        double x = ((98 - 25) * 6);
        System.out.println("x = " + x);

        if (x / 6 + 25 == 98) {
            System.out.println("Решение верно!");
        }
    }
}
