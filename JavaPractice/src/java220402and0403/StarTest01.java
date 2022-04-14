package java220402and0403;

public class StarTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < i+1; j++) { //j는 i보다 작을때까지
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
	}

}
