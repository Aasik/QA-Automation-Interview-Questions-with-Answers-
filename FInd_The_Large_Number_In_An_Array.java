package basics;

import java.util.Scanner;

public class FInd_The_Large_Number_In_An_Array {

	public static int getLarge(int[] array) {
		
		int max = array[0];
		
		for(int i = 0; i < array.length;i++) {
				if(array[i] > max) {
					max = array[i];
				}
		}
		
		
		System.out.println("Max number is " + max);
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		
		int[] array2 = {1,2,3,4,5,};
		getLarge(array2);
		
	}
	

}
