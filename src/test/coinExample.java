package test;

public class coinExample {

	public static void main(String[] args) {
		int money = 3680;
		int restMoney = money;

		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;

		count500 =restMoney / 500;
		System.out.println("500원 : " + (restMoney / 500));
		restMoney = restMoney % 500;
		System.out.println("남은금액  : " + restMoney);

		count100 =restMoney / 100;
		System.out.println("100원 : " + (restMoney / 100));
		restMoney = money % 100;
		System.out.println("남은금액  : " + restMoney);

		count50 =restMoney / 50;
		System.out.println("50원 : " + (restMoney / 50));
		restMoney = money % 50;
		System.out.println("남은금액  : " + restMoney);

		count10 =restMoney / 10;
		System.out.println("10원 : " + (restMoney / 10));
		restMoney = money % 10;
		System.out.println("남은금액  : " + restMoney);

		System.out.println(money + "의 최소동전 개수는?");
		System.out.println("500원 " + count500 + "개");
		System.out.println("100원 " + count100 + "개");
		System.out.println("50원 " + count50 + "개");
		System.out.println("30원 " + count10 + "개");
	}

}
