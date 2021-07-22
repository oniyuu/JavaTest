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

public class RoomTest03 {
	static int[] roomRemain = new int[12];
	static int[] reservNum = new int[12];
	static String[] reservName = new String[12];
	static int[] reservPeople = new int[12];
	static int room = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean hotel = true;
		while (hotel) {
			System.out.println("==============[메뉴]==============");
			System.out.println("1.예약  2.취소  3.전체룸 확인  99.종료");
			System.out.println("=================================");
			System.out.print("번호를 입력해 주세요 : " );
			room = scan.nextInt();
			System.out.println();
			
			switch (room) {
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
					for (int i=0 ; i <12 ; i++) {
						roomRemain[i] = 0;
						reservNum[i] = 0;
						reservName[i] = null;
						reservPeople[i] = 0;
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
			room = scan.nextInt();
			if (room > 12 || room < 1) {
				System.out.println("숫자를 잘못 입력했습니다.");
				System.out.println();
				continue;
			} else if (roomRemain[room-1] != 1) {
				System.out.println(room + "번 방을 예약합니다.");
				roomRemain[room-1] = 1;
				System.out.print("예약자 성함을 입력해주세요 : ");
				reservName[room-1] = scan.next();
				while (result) {
					System.out.print("예약인원은 몇명 입니까 (최대4명): ");
					reservPeople[room-1] = scan.nextInt();
					if (reservPeople[room-1]>0 && reservPeople[room-1] <5) {
						reservNum[room-1] = 2000+room;
						System.out.println("");
						System.out.println("성함:" + reservName[room-1] + ", 예약번호:" + reservNum[room-1] + ", 예약인원:" + reservPeople[room-1]);
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
			room = scan.nextInt();
			room = room-2000;
			
			if (room > 12 || room < 1) {
				System.out.println("숫자를 잘못 입력했습니다.");
				System.out.println();
				continue;
			} else if (roomRemain[room-1] == 1) {
				System.out.println(room + "번 방을 취소합니다.");
				roomRemain[room-1] = 0;
				reservNum[room-1] = 0;
				reservName[room-1] = null;
				reservPeople[room-1] = 0;
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
			if (roomRemain[i] != 1) {
				System.out.println("예약 가능");
			} else {
				System.out.println("성함:" + reservName[i] + ", 예약번호:" + reservNum[i] + ", 예약인원:" + reservPeople[i]);
			}
		}
	}
}
