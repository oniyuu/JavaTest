/*
 * 자판기 설계하여 구현해보기
 * ====================[MENU]===================
 * 1. 동전투입 [0]
 * 2. 음료수 선택
 *    - 1. 사이다(500) 2. 콜라(500) 3.커피(1000) 4.취소
 * 3. 음료 남은 개수
 * 4. 반환(거스름돈 주세요)
 * 99. 자판기 종료(프로그램종료)
 * =============================================
 * 1차원 배열로 작성 : drinkName[3],drinkPrice[3],drinkGa[3]
 */
package kr.co.job.exec;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// 선언
		String[] drinkName = {"사이다", "콜라", "커피"};
		int[] drinkPrice = {500, 500, 1000}, drinkGa = {3,3,3};
		int num1=0, pay=0, coin=0;
		boolean result1 = true;
		Scanner scan = new Scanner(System.in);
		
		while (result1) {
			System.out.println();
			System.out.println("====================[MENU]===================");
			System.out.println("1. 동전투입 ["+pay+"]");
			System.out.println("2. 음료수 선택");
			System.out.println("3. 음료 남은 개수");
			System.out.println("4. 반환(거스름돈 주세요)");
			System.out.println("99. 자판기 종료(프로그램종료)");
			System.out.println("=============================================");
			System.out.print("번호를 선택해 주세요 : ");
			num1 = scan.nextInt();
			
			switch (num1) {
			case 1:
				System.out.print("1. 동전투입 [" + pay + "] : ");
				coin = scan.nextInt();
				pay = pay + coin;
				System.out.println("금액 : " + pay);
				
			case 2:
				int num2=0;
				boolean result2 = true;
				
				while (result2) {
					System.out.println();
					System.out.printf("1.%s(%d) 2.%s(%d) 3.%s(%d) 4.취소%n", drinkName[0], drinkPrice[0], drinkName[1], drinkPrice[1], drinkName[2], drinkPrice[2] );
					System.out.print("음료를 선택해 주세요 : ");
					num2 = scan.nextInt();
					
					switch (num2) {
						case 1:
							if (drinkPrice[num2-1] <= pay && drinkGa[num2-1] >= 1) {
								pay = pay - drinkPrice[num2-1];
								drinkGa[num2-1] = drinkGa[num2-1] - 1;
								System.out.println();
								System.out.println(drinkName[num2-1]+"가 나왔습니다.");
							} else if (drinkGa[num2-1] < 1) {
								System.out.println();
								System.out.println("재고가 없습니다. 다른 음료를 골라 주세요.");
							} else if (pay < drinkPrice[num2-1]){
								System.out.println();
								System.out.println("돈이 모자랍니다. 동전을 추가로 넣어주세요.");
							} 
							break;
							
						case 2:
							if (drinkPrice[num2-1] <= pay && drinkGa[num2-1] >= 1) {
								pay = pay - drinkPrice[num2-1];
								drinkGa[num2-1] = drinkGa[num2-1] - 1;
								System.out.println();
								System.out.println(drinkName[num2-1]+"가 나왔습니다.");
							} else if (drinkGa[num2-1] < 1) {
								System.out.println();
								System.out.println("재고가 없습니다. 다른 음료를 골라 주세요.");
							} else if (pay < drinkPrice[num2-1]){
								System.out.println();
								System.out.println("돈이 모자랍니다. 동전을 추가로 넣어주세요.");
							} 
							break;
							
						case 3:
							if (drinkPrice[num2-1] <= pay  && drinkGa[num2-1] >= 1) {
								pay = pay - drinkPrice[num2-1];
								drinkGa[num2-1] = drinkGa[num2-1] - 1;
								System.out.println();
								System.out.println(drinkName[2]+"가 나왔습니다.");
							} else if (drinkGa[num2-1] < 1) {
								System.out.println();
								System.out.println("재고가 없습니다. 다른 음료를 골라 주세요.");
							} else if (pay < drinkPrice[num2-1]){
								System.out.println();
								System.out.println("돈이 모자랍니다. 동전을 추가로 넣어주세요.");
							}
							break;
							
						case 4:
							System.out.println();
							System.out.println("취소되었습니다.");
							result2 = false;
							break;
							
						default:
							System.out.println();
							System.out.println("숫자를 잘 못 입력하였습니다. 다시 입력해 주세요.");
							continue;
						}
					}
					continue;

			case 3:
				System.out.println();
				System.out.println("3. 음료 남은 개수");
				System.out.println(drinkName[0] + " : " + drinkGa[0] + "개");
				System.out.println(drinkName[1] + " : " + drinkGa[1] + "개");
				System.out.println(drinkName[2] + " : " + drinkGa[2] + "개");
				break;
				
			case 4:
				System.out.println();
				System.out.println("4. 반환(거스름돈 주세요)");
				if(pay > 0) {
					System.out.println("거스름 돈 : " + pay);
					pay = 0;
				} else {
					System.out.println("반환 될 금액이 없습니다.");
				}
				break;
				
			case 99:
				System.out.println();
				System.out.println("99. 자판기 종료(프로그램종료)");
				result1 = false;
				break;
				
			case 7654:
				int num3=0;
				boolean result3=true;
				
				while (result3) {
					System.out.println();
					System.out.println("[관리자모드]");
					System.out.println("1.음료이름 변경 2.음료가격 변경 3.음료재고 변경 4.취소");
					System.out.print("Input Number : ");
					num3 = scan.nextInt();
					
					switch (num3) {
						case 1:
							int num4=0;
							String name;
							boolean result4=true;
							
							while (result4) {
								System.out.println();
								System.out.println("이름을 변경할 음료를 선택하세요.");
								System.out.printf("1.%s 2.%s 3.%s 4.취소%n", drinkName[0] ,drinkName[1] ,drinkName[2]);
								System.out.print("Input Number : ");
								num4 = scan.nextInt();
								
								switch (num4) {
									case 1:
										System.out.println();
										System.out.print("New Name : ");
										name = scan.next();
										drinkName[num4-1] = name;
										System.out.println();
										break;
									
									case 2:
										System.out.println();
										System.out.print("New Name : ");
										name = scan.next();
										drinkName[num4-1] = name;
										System.out.println();
										break;
										
									case 3:
										System.out.println();
										System.out.print("New Name : ");
										name = scan.next();
										drinkName[num4-1] = name;
										System.out.println();
										break;
										
									case 4:
										System.out.println();
										System.out.println("취소되었습니다.");
										result4 = false;
										break;
									
									default:
										System.out.println();
										System.out.println("숫자를 잘 못 입력하였습니다. 다시 입력해 주세요.");
										continue;
								}
							}
							break;
						
						case 2:
							int num5=0;
							boolean result5=true;
							
							while (result5) {
								System.out.println();
								System.out.println("가격을 변경할 음료를 선택하세요.");
								System.out.printf("1.%s:%d 2.%s:%d 3.%s:%d 4.취소%n", drinkName[0], drinkPrice[0], drinkName[1], drinkPrice[1], drinkName[2], drinkPrice[2]);
								System.out.print("Input Number : ");
								num5 = scan.nextInt();
								System.out.println();
								
								switch (num5) {
									case 1:
										System.out.println();
										System.out.print("New Price : ");
										drinkPrice[num5-1] = scan.nextInt();
										System.out.println();
										break;
									
									case 2:
										System.out.println();
										System.out.print("New Price : ");
										drinkPrice[num5-1] = scan.nextInt();
										System.out.println();
										break;
										
									case 3:
										System.out.println();
										System.out.print("New Price : ");
										drinkPrice[num5-1] = scan.nextInt();
										System.out.println();
										break;
										
									case 4:
										System.out.println();
										System.out.println("취소되었습니다.");
										result5 = false;
										break;
									
									default:
										System.out.println();
										System.out.println("숫자를 잘 못 입력하였습니다. 다시 입력해 주세요.");
										continue;
								}
							}
							break;
							
						case 3:
							int num6=0;
							boolean result6=true;
							
							while (result6) {
								System.out.println();
								System.out.println("재고를 추가할 음료를 선택하세요.");
								System.out.printf("1.%s:%d개 2.%s:%d개 3.%s:%d개 4.취소%n", drinkName[0], drinkGa[0], drinkName[1], drinkGa[1], drinkName[2], drinkGa[2]);
								System.out.print("Input Number : ");
								num6 = scan.nextInt();
								System.out.println();
								
								switch (num6) {
									case 1:
										System.out.println();
										System.out.print("+Amount : ");
										drinkGa[num6-1] += scan.nextInt();;
										System.out.println();
										break;
									
									case 2:
										System.out.println();
										System.out.print("+Amount : ");
										drinkGa[num6-1] += scan.nextInt();
										System.out.println();
										break;
										
									case 3:
										System.out.println();
										System.out.print("+Amount : ");
										drinkGa[num6-1] += scan.nextInt();
										System.out.println();
										break;
										
									case 4:
										System.out.println();
										System.out.println("취소되었습니다.");
										result6 = false;
										break;
									
									default:
										System.out.println();
										System.out.println("숫자를 잘 못 입력하였습니다. 다시 입력해 주세요.");
										continue;
								}
							}
							break;
							
						case 4:
							System.out.println();
							System.out.println("취소되었습니다.");
							result3 = false;
							break;
						
						default:
							System.out.println();
							System.out.println("숫자를 잘 못 입력하였습니다. 다시 입력해 주세요.");
							continue;
					}
				}
				break;
			
			default:
				System.out.println();
				System.out.println("숫자를 잘 못 입력하였습니다. 다시 입력해 주세요.");
				continue;
			}
		}
	}
}
