package Array;

public class FarenheitConvert {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double tf = 9 / 5.0 * 41 + 32; //что бы сработало нужно было добавить 5.0 что бы сработал дабл
        return tf;
    }
}