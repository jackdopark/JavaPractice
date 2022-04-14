package java220409and0410;

public class Class02 {
	
	public static void main(String[] args) {
		
		
		//학생 객체를 생성해봅시다.
		Class01 st1 = new Class01();
		Class01 st2 = new Class01();
		
		//다른 공간에 만들어졌으므로 다르다
		System.out.println(st1 == st2);
		
		
		//클래스의 변수에 값을 넣어보자
		//인스턴스명 .~ 이런식으로 .(마침표) 뒤에 접근가능한 변수의 메서드 또는 변수를 연결할 수 있다.
		//메서드를 사용하다 ==> 메서드를 호출하다
		st1.myName = "홍길돌";
		st1.kor = 90;
		st1.eng = 88;
		st1.math = 94;
		
		st1.printInfo();
		
		st2.myName = "김철";
		st2.kor = 91;
		st2.eng = 100;
		st2.math =  98;
		
		st2.printInfo();
		
		
	}
	
}
