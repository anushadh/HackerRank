package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(sc.hasNext()) {
			count++;
			System.out.println(count + " " + sc.nextLine());
		}
		
	}
	
}
