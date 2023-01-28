package codingtest;

public class BubbleSort2 {
	/*
	 * 버블정렬 -> 서로 이웃한 데이터들을 비교하여 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식이다.
	 */
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 10, 8, 5, };
		// 버블정렬 먼저 2개를 비교, 0번지가 더 크면 두개의 위치 변경
		for (int i = 0; i < 5; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		} // 리팩토리 (코드 수정!)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("=================1번 정렬!!");
		} // 2번재사이클
		for (int i = 0; i < 4; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		} // 리펙토리 (코드를 수정)

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("=====2번 정렬");
		}
		for (int i = 0; i < 3; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		} // 리펙토리 (코드를 수정)

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("=====3번 정렬");
		}
		for (int i = 0; i < 2; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		} // 리펙토리 (코드를 수정)

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("=====4번 정렬");
		}
		for (int i = 0; i < 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		} // 리펙토리 (코드를 수정)

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		{
			System.out.println("=====5번 정렬");
		}
	}
}