package java220402and0403;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		
		for(int i=0; i<arr.length; i++) {
			
			
			arr[i] = (int)(Math.random()*30)+1;
		}
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("arr["+i+"] =  "+arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
