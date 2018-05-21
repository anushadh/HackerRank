package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaSubstringComparisons {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		
		String smallest = s.substring(0,k);
		String largest = s.substring(0,k);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i <= s.length(); i++){
			if(k<=s.length()) {
				//System.out.println(s.substring(i, k));
				list.add(s.substring(i, k));
				if(s.substring(i,k).compareTo(smallest) < 0) {
					smallest = s.substring(i,k);
				} else if(s.substring(i,k).compareTo(largest) > 0) {
					largest = s.substring(i,k);
				}
				k++;
			}			
		}
		Collections.sort(list);
		/*for(String inOrder : list){
			System.out.println(inOrder);
		}*/
		
		System.out.println(list.get(0) + "\n" + list.get(list.size()-1));
		System.out.println(Collections.min(list) + "\n" + Collections.max(list));
		System.out.println(smallest + "\n" + largest);
		sc.close();
	}
	
}
