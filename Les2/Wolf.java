public class Wolf {
//TODO создайте класс
//напишите в нем поля: пол, кличка, вес, возраст, окрас
//напишите в нем методы: идти, сидеть, бежать, выть, охотиться

//TODO2 у всех полей класса напишите модификатор доступа private
// у всех методов класса напишите модификатор доступа public
// для доступа к полям создайте геттеры и сеттеры
// в сеттере поля age реализуйте проверку: если возраст волка > 8
// лет, то выведите сообщение "Некорректный возраст"
	private String name = "shakal";
	private String male = "male";
	private String hair = "black";
	private int age = 10;
	private int ves = 50;

	public String getName() {
		return name;
	}
	void setName(String name) {
		if(name == ""){
			System.out.println("pustaya stroka");
		} else {
			this.name = name;
		}
	}
	public int getAge(){ //=====================
		return age;
	}	
	void setAge(int age) {
		if(age > 8){
			System.out.println("Nekorrektniy age");
		} else {
			this.age = age;
		}
	}
	public int getVes(){  //================
		return ves;
	}
	void setVes (int ves) {
		if(ves < 60){
			System.out.println("veveveveve");
		} else {
			this.ves = ves;
		}
	}
	public boolean idti() {
		System.out.println("poshel");
		return true;
	}
	public boolean sidet() {
		System.out.println("sidit");
		return true;
	}
	public boolean bejat() {
		System.out.println("bejit");
		return true;
	}
	public boolean gavgav() {
		System.out.println("gavkaet");
		return true;
	}
	public boolean hunt() {
		System.out.println("ohotitsa");
		return true;
	}
}