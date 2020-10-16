public class WolfTest { //компилировать оба файла
	public static void main(String[] args) {
//TODO создайте объект типа Wolf
//присвойте в нем полям экземпляра класса Wolf какие-то значения
//считайте эти значения из полей и отобразите в консоли

		Wolf dog1;
		dog1 = new Wolf();
		System.out.println("klichka " + dog1.getName());
		System.out.println("age " + dog1.getAge());
		System.out.println("ves " + dog1.getVes());
		System.out.println(dog1.hunt());
	}
}