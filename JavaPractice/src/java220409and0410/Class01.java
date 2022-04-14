package java220409and0410;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Class01 {
	
	//맴버변수 만들기
	public String myName;
	public int kor;
	public int eng;
	public int math;
	
	
	//총점을 구하는 메서드를 만들어보자.
	//파라미터를 준다= 정보를 준다.
	//리턴이 있고 파라미터가 있는
	//리턴이 있고 파라미터가 없는
	//리턴이 없고 파라미터가 있는
	//리턴이 없고 파라미터가 없는
	
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		double avg = (double)getTotal() /3;
		avg = new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		return avg;
	}
	
	//학생정보를 출력하는 메서드를 만들어보자
	public void printInfo() {
		String str="";
		str += "이름"+ myName+"\t";
		str += "국어"+ kor+"\t";
		str += "영어"+ eng+"\t";
		str += "수학"+ math+"\t";
		str += "총점"+ getTotal()+"\t";
		str += "평균"+ getAvg()+"\t";
		
		System.out.println(str);
	}

}
