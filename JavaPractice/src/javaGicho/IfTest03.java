package javaGicho;

public class IfTest03 {

	public static void main(String[] args) {
		//랜덤함수
		
		int score = (int)(Math.random()*100)+1; 
		//첫글자가 대문자면 무조건 클래스, 위의 Math는 클래스이다.
		//뒤의 random의 범뮈는 0~0.9999999....
		//즉 0 <= x < 1
		//앞에 int로 형변환을 해준다.
		
		//int score = (int)(Math.random()*(100-60+1))+60; 
		//식을 위와 같이 만들면 최대값 100, 최소값 60인 숫자가 나온다.
		//(max - min + 1) + min
		System.out.println("점수 : "+ score);
		if( score >= 90) {
			System.out.println("A학점");
		}else if (score>=80) {
			System.out.println("B학점");
		}else if (score>=70) {
			System.out.println("C학점");
		}else if (score>=60) {
			System.out.println("D학점");	
		}else {
			System.out.println("F학점");
		}

	}

}
