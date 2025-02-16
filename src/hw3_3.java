//3. Даны числа a=35, b=65. Если а>b,
//то присвоить числу c значение 5 иначе,
//присвоить числу c значение 10. (тернарный оператор)

public class hw3_3 {
    public static void main(String[] args) {
        int a = 35;
        int b = 65;
        int c;
        if (a > b) {
            c = 5;
        } else {
            c = 10;
        }
        System.out.println("c = " + c);
    }
}
