package Array;

public class LookingForMinimum {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
//        int m = 0;
//        int minA = min(a, b);
//        int minC = min(c, d);
//        if (min(a, b) <= c && min(a, b) <= d) {
//            return min(a, b);
//        }
//        if (c <= min(a, b) && c <= d) {
//            return c;
//        }
//        if (d <= min(a, b) && d <= c) {
//            return d;
//        }
//        return m;
//    }
        int m = 0;
        if( a <= b && a <= c && a < d)
            m = a;
        else if(b <= a && b <= c && b < d)
            m = b;
        else if(c <= a && c <= b && c < d)
            m = c;
        else if(d < a && d < b && d < c)
            m = d;
        return m;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if( a < b)
            return a;
        else
        return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}