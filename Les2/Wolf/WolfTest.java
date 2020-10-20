package Wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf dog1 = new Wolf();
		Wolf dog2 = new Wolf();
		dog1.setName("Shakal");
		dog1.setMale("male");
		dog1.setHair("Black");
		dog1.setAge(5);
		dog1.setVes(20);
		dog2.setName("Giena");
		dog2.setMale("Female");
		dog2.setHair("White");
		dog2.setAge(2);
		dog2.setVes(15);
		System.out.println(dog1);
		System.out.println(dog2);
		dog1.idti();
		dog2.bejat();
		System.out.println(dog1.hunt());
	}
}

//выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы).
// Реализуйте это в коде (не усложняйте реализацию. Делайте все максимально просто)
//	создайте 2 экземпляра класса Wolf в классе WolfTest и поэкспериментируйте с ними
//	(проинициализируйте поля, вызывайте методы, перезаписывайте и выводите значения полей)
//	для инициализации полей объектов при их создании используйте в начале сеттеры
//	(покажите решение ментору), а потом перепишите, используя конструктор