package day02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		int i = 3;
		float f =3.14f;
		double d=3.14;
		char c='a';
		System.out.println(s instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer);
		System.out.println(Float.valueOf(f) instanceof Float);
		System.out.println(Double.valueOf(d) instanceof Double);
		System.out.println(Character.valueOf(c) instanceof Character);
		
	}

}
