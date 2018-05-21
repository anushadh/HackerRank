package strings;
import java.util.Scanner;

public class JavaSubstring {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		if(s.length() >= 1 && s.length() <= 100) {
			
			System.out.println(s.substring(start, end));
			
		}
				
		sc.close();
	}
	
}
