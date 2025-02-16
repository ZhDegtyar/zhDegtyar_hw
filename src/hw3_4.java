//4*. Даны значения: x=5; y=2; c=x*y;
//Расставьте операции инкремента декремента так,
//чтобы после выполнения операции (c=x*y) с равнялось 12,
// x=равнялось 6, y=1Выведите полученные значения в консоль
public class hw3_4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int c = ++x * y;
        System.out.println("c = " + c);

        System.out.println("x = " + (x));
        System.out.println("y = " + (--y));


    }
}
