package java220402and0403;

public class WhileTest02 {

	public static void main(String[] args) {
		// while(조건식){}
		//while문은 몇번 돌릴지 코드상에서 제어해줘야됨.
		
		int count = 1;
		int sum=0;
		
		while (count <=100) {
			sum += count;
			
			//와일문은 포문처럼 증감식이 없어서 코드에서 직접해줘야 한다.
			//와일문은 포문에서 조건식이 있다고 생각하면 된다.
			count++;
		}
		
		System.out.println("합: "+sum);
		
	}

}
