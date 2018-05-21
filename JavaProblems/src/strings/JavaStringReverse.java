package strings;
import java.util.Scanner;

public class JavaStringReverse {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String temp = "";
//		if(s.length() <= 50) {
//			for (int i = s.length()-1; i >= 0 ; i--) {
//				temp = temp + s.charAt(i);
//				
//			}
//		}
		
		temp = new StringBuilder(s).reverse().toString();
		
		if(s.equals(temp)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		//System.out.println(temp);
		sc.close();
		
	}
	
}
