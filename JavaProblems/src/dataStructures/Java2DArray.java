package dataStructures;

import java.util.Scanner;

public class Java2DArray {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		
		for(int i = 0; i < 6; i++) {
			for (int j = 0; j < 6 ;j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int glassSum = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;
		for(int i = 0; i < 4; i ++) {
			for (int j = 0; j < 4 ;j++) {
				
				glassSum = arr[j][i] + arr[j][i+1] + arr[j][i+2] +
						arr[j+1][i+1] + 
						arr[j+2][i] + arr[j+2][i+1] + arr[j+2][i+2];
				if(glassSum > temp) {
					temp = glassSum;
				}
			}
		}
		
		System.out.println(temp);
		
		in.close();
	}

}
