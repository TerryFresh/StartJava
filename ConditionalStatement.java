public class ConditionalStatement {
	public static void main(String [] args) {

		// TODO: Перепишите псевдокод, приведенный ниже, с помощью языка Java
		// Используйте переменные и условные операторы, не используйте String
		// Выводите сообщения на консоль.
		
		/* ЕСЛИ(возраст > 20) 
    	сообщение
		ЕСЛИ(мужскойПол) 
   		 сообщение
		ЕСЛИ(!мужскойПол) 
  		  сообщение
		ЕСЛИ(рост < 1.80) 
  		  сообщение
 			ИНАЧЕ 
 		   сообщение
		ЕСЛИ(перваяБукваИмени == ‘M’) 
 		   сообщение
 			ИНАЧЕ ЕСЛИ(перваяБукваИмени == ‘I’) 
 		   сообщение
			 ИНАЧЕ 
   		 сообщение */
		int age = 30;
		boolean male = true;
		double rost = 1.70;
		char firstWordName = 'M';
		if(age>20){
			System.out.println("bolshe 20");
			}
		if(male){
			System.out.println("muzhik");
			}
		if(!male){
				System.out.println("ne muzhik");
			}
		if(rost<1.80){
			System.out.println("menshe 180");
			}else{
				System.out.println("bolshe 180");
			}
		if(firstWordName=='M'){
			System.out.println("da verno M");
		}else if(firstWordName=='I'){
			System.out.println("da verno I");
			}else{
				System.out.println("ne verno");
			}
	}
}