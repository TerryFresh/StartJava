public class Calc {
	public static void main(String[] args) {
//TODO: Сделать калькулятор, которые должен уметь + - * / 
//над целыми числами. для проверки знака мат операции - if else
//выведите на экран результат работы калька с помощью системАутПринт

		int x = 20;
		int y = 15;
		char operations = '+';
		int result = 0;
		if(operations == '+'){
			result = x + y;
			System.out.println(result + " ");
		}else if(operations == '-'){
			result = x - y;
			System.out.println(result + " ");
		}if (operations == '*'){
			result = x * y;
			System.out.println(result + " ");
		}else if(operations == '/'){
			result = x / y;
			System.out.println(result + " ");
		}
	}
}