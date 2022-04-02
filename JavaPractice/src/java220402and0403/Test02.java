package java220402and0403;


public class Test02 {

	public static void main(String[] args) {
		
		int even = 0; //짝수의 합
		int odd = 0;  // 홀수의 합
		
		for(int i =  1; i<=100; i++) {
			if( i%2==0) {
				//2로 나눠지면 짝
				even +=i ; //even = even +i;와 같은 의미 
			}else{
				odd = odd+i;
			}
		}
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);
	}

}
