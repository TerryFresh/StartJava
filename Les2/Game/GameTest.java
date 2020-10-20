package Game;
import java.util.Scanner;
import java.util.Random;
public class GameTest {
    public static void main(String[] args) {
        //отвечает за создание объектов, их инициализацию, запуск игры. Содержит метод main
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.println(" Игра запущена ");
        System.out.println(" Угадайте число от 1 до 100 ");
        String answer = "да";
            System.out.println(" Первый игрок вводит имя ");
            String name1 = scanner.next();
            game.setName1(name1);
            System.out.println(" Второй игрок вводит имя ");
            String name2 = scanner.next();
            game.setName2(name2);
        while(answer.equals("да")) {
            System.out.println(name1 + " вводит число ");
            int number1 = scanner.nextInt();
            game.setNumber1(number1);
            System.out.println(name2 + " игрок вводит число ");
            int number2 = scanner.nextInt();
            game.setNumber2(number2);
            game.play();
            do {
                System.out.println("Заново? [да/нет]   ");
                answer = scanner.next();
            }while(!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("Конец игры ");
    }
}
