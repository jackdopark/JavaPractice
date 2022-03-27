package javaGicho;

public class Iftest04 {

	public static void main(String[] args) {
		//옵션이냐 필수냐의 차이

		int age = 17;
		char ch = 'A';
		
		if (ch =='B' || age >15 || age > 20) { //합집
			System.out.println("B pass");
		}
		
		if (ch =='B' && age > 15) { //교집
			System.out.println("A pass");
		}
		
		if( (age>15 && age <30) || ch =='A') {
			System.out.println("pass,");
		}
	}

}
