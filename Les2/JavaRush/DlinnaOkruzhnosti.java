package Array;

public class DlinnaOkruzhnosti {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double pi = 3.14;
        double s = 2*pi*radius;
        System.out.println(s);
    }
}