package javaGicho;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산
		int num01 = 10;
		int sum = 0;
		
		//배열에서 전위,후위 연산식을 많이 쓴다.
		
		//전위=증감연산자가 앞에 있
		//값을 증가시키고(수식이전에 값이 증가) 수식이 시작된다.
		sum = ++num01;
		System.out.println("sum: "+sum+", num01: "+num01);
		
		
		//후위=값을 앞에 두고 증감연산자를 뒤에 있
		//수식이 끝나고 값을 증가시킨다.
		sum = num01++;
		//위에서의 ++num01의 값으로 해 sum은 11, num01은 12
		System.out.println("sum: "+sum+", num01: "+num01);
		
		
		//제어문 if문과 switch문이 있다.
		
		
		
		
		
	}

}
