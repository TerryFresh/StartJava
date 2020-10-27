package Array;

public class LfMinimum {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int m = 0;
        if( a <= b && a <= c)
            m = a;
        else if(b <= a && b <= c)
            m = b;
            else if(c <= a && c <= b)
            m = c;
        return m;
    }
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}