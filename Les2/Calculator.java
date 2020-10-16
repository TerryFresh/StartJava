import java.util.Scanner;

public class Calculator {
	private int n1;
	private char operations;
	private int n2;

	public void setN1(int n1){
		this.n1 = n1;
	}
	public void setOperations(char operations){
		this.operations = operations;
	}
	public void setN2(int n2){
		this.n2 = n2;
	}
	public void calculate(){
		switch(operations){
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n1 / n2);
				break;
			case '^':
				pow();
				break;
			case '%':
				System.out.println(n1 % n2);
				break;
			default:
			System.out.println(" incorrect symbol ");
		}
	}
	private void pow() {
		int result = 1;
		for(int i = 0; i < n2; i++){
			result = result * n1;
		}
		System.out.println(result);
	}
}