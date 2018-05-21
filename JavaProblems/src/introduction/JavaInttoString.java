package introduction;

import java.util.Scanner;

public class JavaInttoString {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n >= -100 && n <= 100) {
			
			Integer i = (Integer)n; 
			/*String s = i.toString();
			System.out.println(s);*/
			
			String s = Integer.toString(n);
			//String s = String.valueOf(n);
		}
		
		sc.close();
		
	}
	
}
