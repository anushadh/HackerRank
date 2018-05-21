package introduction;
import java.util.Scanner;

public class JavaLoops1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		if(input >=2 && input <=20) {
			for(int i = 1; i <=10; i++) {
				System.out.println(input + " x " + i + " = " + i*input);
			}
		}	
		
	}
	
}
