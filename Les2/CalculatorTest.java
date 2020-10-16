import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		char y;
		char n;
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.println(" Start ");

		String answer = "y";
		while(answer.equals("y")){


		System.out.print(" vvedite 1-oe chsilo ");
		int n1 = scanner.nextInt();
		calc.setN1(n1);

		System.out.print(" vvedite znak operacii ");
		String text = scanner.next();
		char operations = text.charAt(0);
		calc.setOperations(operations);

		System.out.print(" vvedite 2-oe chsilo ");
		int n2 = scanner.nextInt();
		calc.setN2(n2);

		calc.calculate();
		do {
		System.out.print(" Prodoljaem y/n ");
			answer = scanner.next();
		}while(!answer.equals("y") && !answer.equals("n"));
		}
	}
}
//реализ доп класс CalculatorTest, перенеся в него метод main
//для выбора вычисления той или иной математической операции 
//используйте проверку математического знака с помощью switch
//для ввода мат. выражения используйте клавиатуру (класс Scanner)
// формат ввода математического выражения:
// Введите первое число: 2
// Введите знак математической операции: ^
// Введите второе число: 10
		// int x = 2;
		// int y = 10;
		// char operations = '+';
		// int result = 0;
		// if(operations == '+'){
		// 	result = x + y;
		// 	System.out.println(result + " ");
		// }else if(operations == '-'){
		// 	result = x - y;
		// 	System.out.println(result + " ");
		// }else if (operations == '*'){
		// 	result = x * y;
		// 	System.out.println(result + " ");
		// }else if(operations == '/'){
		// 	result = x / y;
		// 	System.out.println(result + " ");
		// }else if(operations =='^'){
		// 	int resultat = 1;
		// 	for(int i = 0; i<y; i++){
		// 		resultat = resultat * x;
		// 	}
		// 	System.out.println(resultat);
		// }else if(operations== '%'){
		// 	result = x % y;
		// 	System.out.println(result + " ");
		// }