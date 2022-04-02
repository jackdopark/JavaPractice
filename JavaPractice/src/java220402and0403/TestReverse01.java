package java220402and0403;

public class TestReverse01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5-i; j++) { //j는 i보다 작을때까지
				System.out.print("*");
			}
			//라인변
			System.out.println();
		}
		System.out.println();
	
	//위의 반복문과 아래의 반복문의 출력값은 같다.
	for (int i = 0; i < 5; i++) {
		
		for (int j = (5-i); j > 0; j--) { //j는 i보다 작을때까지
			System.out.print("*");
		}
		//라인변
		System.out.println();
	}
	
	}

}
