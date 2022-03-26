package day01;

public class Ex03 {
	//변수란 값을 저장할 수 있는 공간 혹은 메모 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수를 선언 할때는 여러 방법이 있지만 아래왁 같이 여러 변수를 모아서 선언할 수도 있다.
		//변수의 타입은 앞, 변수의 이름은 뒤에 적는다.
		//변수의 이름을 정할때 주의할점은 첫번째 글자는 문자이거나 $,_로 시작할 수 있지만 숫자로는 시작이 불가능하고 다른 기호가 들어가는 것도 불가능하다.
		// EX) int $1; 은 가능, int $#, 1abc;은 불가능 
		//첫 문자는 영어 소문자로 시작하고 다른 단어가 붙으면 첫 문자를 대문자로 한다. int appleMacbook
		int x,y,z,$1;
		double _x,_y,_z;
		
		//변수의 선언과 대입을 한줄로 간단하게 할 수도 있다.
		int a=5;
		System.out.println(a);

		x=3; _x=1.1; y=1; _y=3.2;
		System.out.println(x+_x);
		System.out.println(x*_y);
		
		x=2; _y=5.5; $1=45; z=3;
		System.out.println(x-_y);
		System.out.println($1*z);
		System.out.println(y-a);
		//처음 x값을 3으로 넣어줬지만 프로그램이 실행되고 아래의 실행문 출력될때면 x=2가 된다. 기존의 x값은 지워지는 것.
		
	}

}
