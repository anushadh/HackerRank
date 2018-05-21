package introduction;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdInAndStdOut1 {
	
	public static void main(String args[]) {
		
		/*Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		input.close();*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a;
		try {
			while((a = reader.readLine()) != null) {
				System.out.println(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
