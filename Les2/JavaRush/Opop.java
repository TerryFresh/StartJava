package Array;

public class Opop{
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        //напишите тут ваш код
        double weight = earthWeight/100.0*17.0;
        return weight;
    }
}