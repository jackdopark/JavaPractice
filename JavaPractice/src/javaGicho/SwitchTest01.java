package javaGicho;

public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*(100 - 60 +1))+60; 
		
		switch (score / 10) {
		case 10:
			System.out.println("A학점");
			break;
		case 9:
			System.out.println("B학점");
			break;
		case 8:
			System.out.println("C학점");
			break;
		case 7:
			System.out.println("D학점");
			break;	
		default:
			System.out.println("F학");
		}
	}

}
