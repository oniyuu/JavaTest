/*
 * 방 예약 : 12개 방
 * ===============[메뉴]===============
 * 1.예약  2.취소  3.전체룸 확인  99.종료
 * 
 * int[] room = {0,};
 * room[3] => 0 // 예약가능
 * room[3] => 1 // 예약불가
 * 
 * 초기화 => 반복구문 : 메뉴->선택실행 => 종료
 */

package kr.co.job.cheking;

import java.util.Scanner;

public class RoomTest04 {
	static String[][] room = new String[4][12]; //1행 예약상태, 2행 이름, 3행 인원, 4행 예약번호
	static int num = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean hotel = true;
		while (hotel) {
			System.out.println("==============[메뉴]==============");
			System.out.println("1.예약  2.취소  3.전체룸 확인  99.종료");
			System.out.println("=================================");
			System.out.print("번호를 입력해 주세요 : " );
			num = scan.nextInt();
			System.out.println();
			
			switch (num) {
				case 1:
					hotelV3();
					hotelV1();
					break;
				
				case 2:
					hotelV3();
					hotelV2();
					break;
				
				case 3:
					hotelV3();
					break;
					
				case 4321:
					//전체 방 초기화
					System.out.println("=====[전체 방 초기화]=====");
					for (int i=1 ; i<4 ; i++) {
						for (int j=0 ; j<12; j++) {
							room[0][j] = "0";
							room[i][j] = null;
						}
					}
					break;
				
				case 99:
					System.out.println("종료");
					hotel = false;
					break;
					
				default:
					System.out.println("번호를 잘 못 입력하였습니다.");
					System.out.println();
			}
			System.out.println();
		}
	}
	
	private static void hotelV1() {
		boolean result = true;
		
		while (result) {			
			System.out.print("방 번호를 입력해 주세요(1~12) : ");
			num = scan.nextInt();
			if (num > 12 || num < 1) {
				System.out.println("숫자를 잘못 입력했습니다.");
				System.out.println();
				continue;
			} else if (room[0][num-1] != "1") {
				System.out.println(num + "번 방을 예약합니다.");
				room[0][num-1] = "1";
				System.out.print("예약자 성함을 입력해주세요 : ");
				room[1][num-1] = scan.next();
				while (result) {
					System.out.print("예약인원은 몇명 입니까 (최대4명): ");
					room[2][num-1] = scan.next();
					if (Integer.parseInt(room[2][num-1])>0 && Integer.parseInt(room[2][num-1]) <5) {
						room[3][num-1] = String.valueOf(num+2000);
						System.out.println("");
						System.out.println("성함:" + room[1][num-1] + ", 예약인원:" + room[2][num-1] +", 예약번호:" + room[3][num-1]);
						result = false;
					} else {
						System.out.println("인원이 맞지 않습니다.");
						continue;
					}
				}
			} else {
				System.out.println("이미 예약되어있는 방입니다.");
				System.out.println();
				continue;
			}
		}
	}

	private static void hotelV2() {	
		boolean result = true;
		
		while (result) {			
			System.out.print("예약을 취소합니다(예약번호) : ");
			num = scan.nextInt();
			num = num-2000;
			
			if (num > 12 || num < 1) {
				System.out.println("숫자를 잘못 입력했습니다.");
				System.out.println();
				continue;
			} else if (room[0][num-1] == "1") {
				System.out.println(num + "번 방을 취소합니다.");
				room[0][num-1] = "0";
				room[1][num-1] = null;
				room[2][num-1] = null;
				room[3][num-1] = null;
				result = false;
			} else {
				System.out.println("이미 빈 방 입니다.");
				System.out.println();
				continue;
			}
		}
	}
	
	private static void hotelV3() {
		System.out.println("전체룸 확인");
		for (int i=0 ; i<12 ; i++) {
			System.out.print((i+1)+"번 방 : ");
			if (room[0][i] != "1") {
				System.out.println("예약 가능");
			} else {
				System.out.println("성함:" + room[1][i] + ", 예약인원:" + room[2][i] + ", 예약번호:" + room[3][i]);
			}
		}
	}
}
