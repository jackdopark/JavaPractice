package quiz;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 A를 입력해주세요: ");
		int a = sc.nextInt();
		System.out.print("자연수 B를 입력해주세요: ");
		int b = sc.nextInt();
		System.out.print("자연수 C를 입력해주세요: ");
		int c = sc.nextInt();

		if (a < 100 && a >= 1000 && b < 100 && b >= 1000 && c < 100 && c >= 1000)
			return;
		int times = a * b * c;
		int n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;
		String str = Integer.toString(times);

		System.out.println("자연수를 곱한 결과: " + times);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case '0':
				n0++;
				break;
			case '1':
				n1++;
				break;
			case '2':
				n2++;
				break;
			case '3':
				n3++;
				break;
			case '4':
				n4++;
				break;
			case '5':
				n5++;
				break;
			case '6':
				n6++;
				break;
			case '7':
				n7++;
				break;
			case '8':
				n8++;
				break;
			case '9':
				n9++;
				break;
			}
		}
		System.out.println("0의 개수: " + n0);
		System.out.println("1의 개수: " + n1);
		System.out.println("2의 개수: " + n2);
		System.out.println("3의 개수: " + n3);
		System.out.println("4의 개수: " + n4);
		System.out.println("5의 개수: " + n5);
		System.out.println("6의 개수: " + n6);
		System.out.println("7의 개수: " + n7);
		System.out.println("8의 개수: " + n8);
		System.out.println("9의 개수: " + n9);

	}

}
