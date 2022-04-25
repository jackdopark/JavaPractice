package quiz;

import java.util.Scanner;

public class Q2 {

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
		
		int r = 1;
		while(r <= result) r*=10;
		r/=10;
		
		int[] arr=new int[10];
		
		while(r>0) {
			arr[result / r]++;
			result %= r;
		}
		for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		}
	}

}
