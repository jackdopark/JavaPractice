package java220409and0410;

import java.util.Arrays;

public class ArrTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= (int)(Math.random()* 30)+1;
		}
		/*
		 * 버블정렬은 정렬기능들 중에서 제일 배우기 쉽다.
		 * 다만, 다른 정령기능들에 비해서 속도가 다소 느리기 떄문에 실제 실무에서는 많이 쓰이지않는다.
		 * 그냥 기본적인 기능을 이용하여 쉽게 만들수 있는 정렬 기능이다.
		 * 
		 */
		
		int temp=0; //임시로 값을 저장할 변수
		System.out.println("정렬전"+Arrays.toString(arr));
		
		
		for(int i=(arr.length-1); i>0;i--) {
			for(int j=0;j<i;j++) {
				//앞과 뒤를 비
			if(arr[j]>arr[j+1]) {
				// 앞의 값이 뒤보다 크다면 두값을 치환한다.

				temp = arr[j+1]; // 뒤의 값을 임시변수에 저장
				arr[j+1] = arr[j]; //앞의 값을 뒤에 넣는다.
				arr[j] = temp; //앞에 뒤의 값을 대
				}
			}
		}
		System.out.println("정렬후"+Arrays.toString(arr));
	}
	

}
