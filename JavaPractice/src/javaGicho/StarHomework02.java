package javaGicho;

public class StarHomework02 {

	public static void main(String[] args) {
		
		//이등변삼각형입니다.
		for (int i = 0; i < 8; i++) {
			for (int j=0; j < 8+i; j++){
				int k=i+j;
				if (k >6) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}

			}
			
			System.out.println();	
		}
		
	}

}
