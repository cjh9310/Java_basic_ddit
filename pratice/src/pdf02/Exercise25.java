package pdf02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("500원짜리 동전의 갯수: ");
		int coin500 = scanner.nextInt();
		System.out.println("100원짜리 동전의 갯수: ");
		int coin100 = scanner.nextInt();
		System.out.println("50원짜리 동전의 갯수: ");
		int coin50 = scanner.nextInt();
		System.out.println("10원짜리 동전의 갯수: ");
		int coin10 = scanner.nextInt();
		int result = ((coin500*500)+(coin100*100)+(coin50*50)+(coin10*10));
		System.out.println(result);
}
}
