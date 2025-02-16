//3. Даны числа a=35, b=65. Если а>b,
//то присвоить числу c значение 5 иначе,
//присвоить числу c значение 10. (тернарный оператор)
public class hw3_3 {
    public static void main(String[] args) {
        int a = 35;
        int b = 65;
        String c = (a>b) ? "c = 5" : "c =10";
                System.out.println(c);
    }
}
