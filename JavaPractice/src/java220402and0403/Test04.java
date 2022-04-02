package java220402and0403;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이중루프
		
		for(int i=2; i<10;i++) {
			
			for(int j =1; j<10;j++) {
				System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}
			//j가 끝나면 줄을 바꿔준다.
			System.out.println();
		}
		
	}

}
