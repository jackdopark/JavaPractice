package java220402and0403;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		//배열을 선언해봅시다.
		int[] arr01 = new int[5];
		
		//크기와 값을 같이 부여, 최초 선언 시에만 가
		int[] arr02 = {1,2,3,4,5};
		int[] arr03 = {}; //빈 배열 선언 - 실제로 잘안쓴다.

		arr03 = new int[3];
		arr01[0]=5;
		System.out.println(arr01);
		System.out.println(arr01[0]);
		System.out.println(arr02[1]);
	}

}
