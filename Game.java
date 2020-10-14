public class Game {
	public static void main(String[] args) {
		//TODO компьютер загадывает целое число от
		//(0 до 100], которое вам необходимо угадать
		// после каждой неудачной попытки выводите 
		//подсказку: System.out.println("Введенное вами 
		//число больше (меньше) того, что загадал компьютер")
		//если число угадано — System.out.println("Вы угадали!")
		//меняйте значение переменной, хранящей числа игрока, 
		//автоматически по какому-то простому алгоритму
		//игра продолжается до тех пор, пока число не будет угадано
		System.out.println("Ugaday chislo ot 0 do 100");
	int min = 0;
	int max = 100;
	int random = 53;
	int user = 25;
	if(user<random){
			System.out.println("menshe nuzhnogo");
			}
		else if(user>random){
			System.out.println("bolshe nuzhnogo");
			}else{
				System.out.println("Pobeda");
			}
			while(random==user);
	}
}