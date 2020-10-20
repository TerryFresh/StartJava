public class Cycle {
	public static void main(String[] args) {
		//TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
		//Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
		//Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
		for (int i=0; i<=20; i=i+1) {
			System.out.print (i + " ");
		}
		int b = 6;
		while (b >= -6){
           System.out.print(b + " ");
           b-=2;
		} 
		int c = 10;
		int summa = 0;
		do{
			if(c%2==0){
				System.out.print(" ");
			}else{ 
				summa = summa+c;
				System.out.print(c +" ");
			}
			c++;
			}
		while (c <= 20);{
			System.out.print(summa+ " ");
		}
	}
}	