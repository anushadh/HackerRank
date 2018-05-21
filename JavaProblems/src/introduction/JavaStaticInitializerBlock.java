package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static boolean flag = true;
	static int B, H;
	static {
	    Scanner scanInput = new Scanner(System.in);
	    try {
	    	B = scanInput.nextInt();
		    H = scanInput.nextInt();
		    //printArea();
		    
		    if(B<=0 || H<=0) {
		    	flag = false;
		    	System.out.println("java.lang.Exception: Breadth and height must be positive");
		    }
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	    
	    scanInput.close();
	}
	
	public static void main(String args[]) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
