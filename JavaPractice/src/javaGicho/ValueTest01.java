package javaGicho;

public class ValueTest01 {

	public static void main(String[] args) {
		//변수
		int num01 = 10;
		double num2 = 10.454;
		char ch01 = 'A';
		String str = "apple";
		
		int sum=0;
		
		sum = sum +10;
		
		
		//형 변환
		int a1 = 100;
		int a2 = 200;
		byte v1 = 0;
		double v2 = 0;
		
		//자동현변환1 = 왼쪽의 타입범위가 우변의 타입볌위보다 클 경우 우변의 타입범위가 좌변과 같게 변한다.
		v2 = a1; //int 값을 double 타입에 넣음으로써 값이 double로 변경
		
		//자동형변황르 강제변환으로 표현할때
		v2=(double)a1;
		
		v1 = (byte)a1;
		System.out.println(v1);
		
		v1 = (byte)a2;
		System.out.println(v1);
		
		//정수타입을 실수타입으로 바꿀때 많이쓴다.
		//정수를 나눌때 실수값이 보고싶을떄.
		//실수를 정수로 바꿀때
		
		
	}

}
