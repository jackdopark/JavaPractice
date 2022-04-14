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
		//배열의 최대 최솟값구하기
		int max=arr[0];
		int min=arr[0];
		//최대 최소값 구하는 코드
		for(int i=1; i<arr.length; i++) {
		    // 최소값
		    if(arr[i] < min) {
		     min = arr[i];
		    }
		    // 최대값
		    if(arr[i] > max) {
		     max = arr[i];
		    }

		
	
	}
	}
}
