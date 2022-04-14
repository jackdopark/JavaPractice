package javaGicho;

public class StarHomework01 {

	public static void main(String[] args) {
		
		//별찍기 숙제 1번 역직각삼각형 만들기 입니다.
		for (int i = 8; i > 0; i--) {
			
			for (int j = 0; j < 8-i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			}
	}

}
