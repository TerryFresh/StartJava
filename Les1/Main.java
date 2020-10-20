public class Main {
	
	public static void main(String[] args) {

	// TODO: просуммировать числа в диапозоне от 1 - 5

		/*
		1 + 2 + 3 + 4 + 5 = 15

		1 + 2 = 3
		3 + 3 = 6
		6 + 4 = 10
		10 + 5 = 15
		*/

		int sum = 1 + 2;
		boolean isChetnaya = sum % 2 == 0;  //is = вопрос
		if(isChetnaya == true) { 
			System.out.println("chislo" + sum + " chetnaya");
		} else if (isChetnaya == false){
			System.out.println("chsilo" + sum + " nechetnaya");
		}
		int sum1 = sum + 3;
		int sum2 = sum1 + 4;
		int result = sum2 + 5;

		System.out.println(result);

	}
}