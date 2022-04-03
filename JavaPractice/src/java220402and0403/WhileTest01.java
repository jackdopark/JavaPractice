package java220402and0403;

public class WhileTest01 {

	public static void main(String[] args) {

		int sum =0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2>0) {
				//i값이 짝수라면 여기서 멈추고 새로 진행
				//continue 를 만나면 그지점에서 이번 루프를 멈추고 다음 루프를 진
				continue;
			}
			sum +=1;
			
		}
		System.out.println("합: "+sum);
	}

}
