package codingtest;

public class gugudan01 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i = i + 1) {
			System.out.println();

			for (int j = 1; j < 10; j = j + 1) {
				if (i == 3 || i == 4) {
				
					break;
				}
				System.out.println(i + " 곱하기" + j + " 는 " + i * j + "	");
			}
		}
	}
}

//	for (int i = 2; i < 10; i++) {
//		for (int j = 1; j < 10; j++) {
//			System.out.println(i + "*" + j + "=" + i * j); // print로 줄바꿈이 안 된채로 출력
//		}
//		System.out.println(); // 각 숫자의 단이 끝나고 줄바꿈 역할
//	}
//
//	for (int c = 2; c < 10; c++) {
//		for (int a = 1; a < 10; a++) {// 몇단까지 나오게할건지
//			if (c == 3 || c == 4) {
//				
//				break;
//			}
//			System.out.print(a + " 곱하기" + c + " 는" + c * a + "	");
//
//		}
//		System.out.println(); // 각 숫자의 단이 끝나고 줄바꿈 역할
//
//	}
