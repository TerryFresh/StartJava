public class Calc {
	public static void main(String[] args) {
//TODO: Сделать калькулятор, которые должен уметь + - * / 
//над целыми числами. для проверки знака мат операции - if else
//выведите на экран результат работы калька с помощью системАутПринт

		int x = 2;
		int y = 3;
		char operations = '^';
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
		}else if(operations =='^'){   // Верно, но не понятно
			int resultat = 1;
			for(int i = 0; i<y; i++){
				resultat = resultat * x;
			}
			System.out.println(resultat);
			//result = x ^ y;                   не верно
			//System.out.println(result + " ");
		}
	}
}