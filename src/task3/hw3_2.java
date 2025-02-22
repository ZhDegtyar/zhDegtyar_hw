package task3;

//2.  x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения,
// чтобы результат не изменился. x=8; y=9; z=12;
// (операции присваивания, нужно просто написать по-другому)
public class hw3_2 {
    public static void main(String[] args) {
        int x =8;
        System.out.println("x = " + (x+=5));

        int y = 9;
        System.out.println("y = " + (y*=9));

        int z = 12;
        System.out.println("z = " + (z-=6));
    }
}
