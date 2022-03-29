package day02;

import java.util.Scanner;

public class TrafficTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항연산자
		Scanner sc = new Scanner(System.in);
		System.out.println("신호등 프로그램");
		System.out.println("신호를 입력하세요~");
		System.out.println("빨간불: 1, 초록불: 2, 노란불: 3");
		System.out.println("신호입력: ");
		int sign=sc.nextInt();
		String result;
		result=(sign==1)?"정지하세요":sign==2?"출발하세요":"서행하세요~";//삼항연산자가 두개가 들어있다.
		System.out.println(result);
		sc.close();
		
	}

}
