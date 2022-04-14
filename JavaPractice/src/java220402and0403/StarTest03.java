package java220402and0403;

public class StarTest03 {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			//공백이 필요하다  공백은 갈수록 줄어든다.
			//j의 조건이 줄어들어야한다.
			
			for (int j = 0; j < 8-i; j++) {
				System.out.print(" ");
			}
			
			System.out.println("*");

			
		}
		
	}

}
