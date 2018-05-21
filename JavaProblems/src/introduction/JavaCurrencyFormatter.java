package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
	
	/*public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		
		if(d >= 0 && d <= Math.pow(10, 9)) {
			
			NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
			System.out.println(nf.format(d));
			nf = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
			System.out.println(nf.format(d));
			nf = NumberFormat.getCurrencyInstance(Locale.CHINESE);
			System.out.println(nf.format(d));
			nf = NumberFormat.getCurrencyInstance(Locale.FRENCH);
			System.out.println(nf.format(d));
		}
		
		sc.close();
		*/
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        double payment = scanner.nextDouble();
		        scanner.close();
		        NumberFormat nf = null; 
		        String us = null ,india = null, china = null, france = null;
		        // Write your code here.
		        if(payment >= 0 && payment <= Math.pow(10, 9)) {
					
					nf = NumberFormat.getCurrencyInstance(Locale.US);
					us = nf.format(payment);
					Locale locale = new Locale("en","IN");
					nf = NumberFormat.getCurrencyInstance(locale);
					india = nf.format(payment);
					nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
					china = nf.format(payment);
					nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
					france = nf.format(payment);
				}
		        System.out.println("US: " + us);
		        System.out.println("India: " + india);
		        System.out.println("China: " + china);
		        System.out.println("France: " + france);
		    }
	//}
	
}	
