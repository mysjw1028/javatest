package codingtest;

public class BubbleSort1 {
	/*
	 * 버블정렬 -> 서로 이웃한 데이터들을 비교하여 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식이다.
	 */
	public static void main(String[] args) {
		int[] arr = { 40, 30, 10, 8, 5 };
		// 버블정렬 먼저 2개를 비교, 0번지가 더 크면 두개의 위치 변경

		// 첫번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}
		if (arr[3] > arr[4]) {
			int temp;
			temp = arr[3];
			arr[3] = arr[4];
			arr[4] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("1번 정렬");
			System.out.println("=============");
		}
		// 2번 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("2번 정렬");
		}
		// 세번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("3번 정렬");
			System.out.println("=============");
		}
		// 네번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("4번 정렬");
			System.out.println("=============");
		}
	}
	
}