package java220402and0403;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random()*50)+1;
		
		Scanner sc = new Scanner(System.in);
		int matchValue =0;
		
		boolean iswin=false;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("어떤 숫자일까요?");
			matchValue = sc.nextInt(); //키보드로 부터 받은 숫자를 변수에 넣는다.
			
			if(matchValue == answer) {
				System.out.println(i+"번째에 맞춤!! 승리!");
				break; //loop를 종료한다.
			}else if(matchValue > answer) {
				System.out.println("DOWN!!");
			}
			
		else if(matchValue < answer) {
			System.out.println("UP!");
		}
	}
		if(!iswin) { //iswin이 false여야 참이다.
			System.out.println("실패했습니다. 맞춰야할 값은: "+answer+" 입니다.");
		}
		sc.close();//스캐너는 사용후 종료해야한다.
	
  }
}
