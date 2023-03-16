package ch4;

import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 잔액변수
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 |4.종료");
			System.out.println("----------------------------");
			System.out.print("메뉴 선택 >> ");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 예금액 입력받기
				System.out.print("예금액>>");
				int acount = Integer.parseInt(sc.nextLine());
				// 잔액 = 잔액+예금액
				balance = balance + acount;
				// 현재 잔액 출력
				System.out.println("현재잔액 : " + balance);
				break;
			case 2:
				// 출금액 입력받기
				System.out.print("출금액>>");
				int withdraw = Integer.parseInt(sc.nextLine());
				// 잔액=잔액-출금액
				balance = balance - withdraw;
				System.out.println();
				break;
			case 3:
				// 현재잔액출력
				System.out.println("현재잔액 : " + balance);
				break;
			case 4:
				run = false;
				break;

			default:
				break;
			}
		}

	}
}
