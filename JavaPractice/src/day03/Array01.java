package day03;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3명의 학생점수를 저장하자
		
		int sc1 = 100;
		int sc2 = 80;
		int sc3 = 70;
		System.out.println("1번 학생의 점수"+sc1);
		System.out.println("2번 학생의 점수"+sc2);
		System.out.println("3번 학생의 점수"+sc3);
		
		int sc[] = new int[3];
		sc[0]=100;
		sc[1]=80;
		sc[2]=70;
		
		System.out.println("1번 학생의 점수"+sc[0]);
		System.out.println("2번 학생의 점수"+sc[1]);
		System.out.println("3번 학생의 점수"+sc[2]);
		
		//반복문으로도 가능
		
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"번째 학생의 점수: "+sc[i]);
		}
		
		
	}

}
