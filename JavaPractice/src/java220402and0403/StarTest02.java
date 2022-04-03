package java220402and0403;

public class StarTest02 {

	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			//공백이 필요하다  공백은 갈수록 줄어든다.
			//j의 조건이 줄어들어야한다.
			
			for (int j = 0; j < 8-i; j++) {
				System.out.print(" ");
			}
			//별이 필요하다 별은 갈수록 늘어난다.
			//k의 조건이 늘어나야한
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			//숙제 역직각삼각형 만들기
			//이등변 삼각형 만들기(별이 홀수로 증가)
		}
	}

}
