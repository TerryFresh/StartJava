package Array;
import java.lang.String;
//Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
//Присвой каждому животному владельца (owner).
//ты присваиваешь переменной name объекта класса Cat ссылку на объект класса woman и вот это правильно и тут не важно смотреть на то, что Woman у тебя пустой,
public class WomanOwner {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
