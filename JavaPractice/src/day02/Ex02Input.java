package day02;
import java.util.Scanner; //입렵기능을 내 코드에 연결시켜
public class Ex02Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------------------------
		//입력메서드 se.next형식();
		//import java.util.Scanner; 클래스위에 입력 
		Scanner sc = new Scanner(System.in); //스캐너를 앞으로 sc라 이름으로 사용한다. new라는 키워드에 메모리를 할당하고 
		//'(system.in)'으로 키워드 new에 입력기능을 포한한다.
		//sc.next()->문자열로 입력받아라.
		System.out.println(sc.next());
		//---------------
		Scanner ab = new Scanner(System.in);
		String a= ab.next();
		System.out.println(a);
		//---------------
		//sc.nextInt(); //nextInt-> 정수값으로 입력받아라
		System.out.println(sc.nextInt());
		//---------------
		//sc.nextFloat();netFloat()-> 실수값으로 입력받아라 
		System.out.println(sc.nextFloat());
		//---------------
		System.out.println(sc.next()); //만약 hello world라고 입력했을때 출력값은 띄어쓰기 전까지인 hello까지 출력된다.
		//---------------
		System.out.println(sc.nextLine()); //띄어쓰기를 포함하여 출력한다.
		
	}

}
