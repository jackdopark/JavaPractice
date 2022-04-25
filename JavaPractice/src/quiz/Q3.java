package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		//Q1과 같은문제 다른풀이.
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 A를 입력해주세요: ");
		int a = sc.nextInt();
		System.out.print("자연수 B를 입력해주세요: ");
		int b = sc.nextInt();
		System.out.print("자연수 C를 입력해주세요: ");
		int c = sc.nextInt();
		
		int result = a*b*c;
		System.out.println(result);
		
		int[] arr = new int[10];
		
		String str = String.valueOf(result); // result + "";
		char[] numbers = str.toCharArray();
		for (int i = 0; i < numbers.length; i++) {
			//System.out.println(numbers[i]-48);
			arr[numbers[i]-48]++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
