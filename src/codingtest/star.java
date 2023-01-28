package codingtest;

public class star {

	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("1번");
		System.out.println("=====================");
		for (int q = 1; q < 5; q++) {
			for (int w = 1; w < 5; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("2번");
		System.out.println("=====================");
		for (int e = 1; e < 5; e++) {
			for (int a = 0; a < e; a++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(" ");
		System.out.println("3번");
		System.out.println("=====================");
		for (int s = 1; s < 5; s++) {
			for (int t = 5; t > s; t--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println(" ");
		System.out.println("2-1번");
		System.out.println("=====================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) { // 공백을 담당하는 for문
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) { // 별을 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println(" ");
		System.out.println("3-1번");
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) { // 공백을 담당하는 for문
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) { // 별을 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println(" ");
		System.out.println("4번");
		System.out.println("=====================");
		for (int j = 1; j < 5; j++) {
			for (int r = 4; r > 0; r = r - 1) {
				if (j < r) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("5번");
		System.out.println("=====================");
		for (int t = 0; t < 5; t++) {
			for (int j = 1; j <= t; j++) {// i = 0 j = 1부터 시작이기때문에 제외
				// i = 1 j = 1 -->1
				// i = 2 j = 2 -->1,2
				// i = 3 j = 3 -->1,2,3
				// i = 4 j = 4 -->1,2,3,4
				System.out.print(" ");
			}
			for (int k = 9; k >= t * 2 + 1; k--) {// 0*2+1 1 = 987654321
				// 1*2+1 3 = 9876543
				// 2*2+1 5 = 98765
				// 3*2+1 7 = 987
				// 4*2+1 9 = 9
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("6번");
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) { // i = 0 j = 4,3,2,1
				// i = 1 j = 4,3,2
				// i = 2 j = 4,3
				// i = 3 j = 4
				// i = 4 --> j는 4부터 시작하여 i보다 클때까지 - 시키는데 4는 j와 같으므로 제외
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {// k는 1부터 시작
				System.out.print("*"); // i 가 0 -->0*2+1 1 1 = 1
				// i 가 1 -->1*2+1 3 3 <= 1,2,3
				// i 가 2 -->2*2+1 5 5 <= 1,2,3,4,5
				// i 가 3 -->3*2+1 7 7 <= 1,2,3,4,5,6,7
				// i 가 4 -->4*2+1 9 9 <= 1,2,3,4,5,6,7,8,9
			}
			System.out.println();
			
		}

	}
}