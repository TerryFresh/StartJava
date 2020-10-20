package Wolf;

public class Wolf {
	private String name;
	private String male;
	private String hair;
	private int age;
	private int ves;

	public String getName() {
		return name;
	}
	public void setName(String male) {
			this.name = name;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getHair(String hair) {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public int getAge(){
		return age;
	}	
	public void setAge(int age) {
			this.age = age;
	}
	public int getVes(){
		return ves;
	}
	public void setVes (int ves) {
			this.ves = ves;
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