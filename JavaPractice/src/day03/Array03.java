package day03;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []st = {100,95,90,88,93};
			int sum =0;
			for(int i=0; i<st.length;i++) {
				sum += st[i];
			}
		System.out.println("시험평균점수:"+sum/(float)st.length);
	
	}

}
