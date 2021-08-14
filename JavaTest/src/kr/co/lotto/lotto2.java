package kr.co.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lotto2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      List<Integer> num1 = new ArrayList<Integer>();
      List<Integer> num2 = new ArrayList<Integer>();
      List<Integer> num3 = new ArrayList<Integer>();
      List<Integer> num4 = new ArrayList<Integer>();
      List<Integer> num5 = new ArrayList<Integer>();
      List<Integer> num11 = new ArrayList<Integer>();
      List<Integer> num22 = new ArrayList<Integer>();
      List<Integer> num33 = new ArrayList<Integer>();
      List<Integer> num44 = new ArrayList<Integer>();
      List<Integer> num55 = new ArrayList<Integer>();
      List<Integer> lotto = new ArrayList<Integer>();
      List<Integer> flotto = new ArrayList<Integer>();
      int select = 0;
      int out = 0;
      int overlap = 0;
      int n1,n2,n3;
      int a=0;

      boolean result = true;
      boolean fresult = true;

      // 1부터 45까지 생성
      // 버튼을 만들어서 제외수 하나씩 주석 처리
//      num1.add(1);
//      num1.add(2);
//      num1.add(3);
//      num1.add(4);
//      num1.add(5);
//      num1.add(6);
//      num1.add(7);
//      num1.add(8);
//      num1.add(9);
//      num2.add(10);
//      num2.add(11);
//      num2.add(12);
//      num2.add(13);
//      num2.add(14);
//      num2.add(15);
//      num2.add(16);
//      num2.add(17);
//      num2.add(18);
//      num2.add(19);
//      num3.add(20);
//      num3.add(21);
//      num3.add(22);
//      num3.add(23);
//      num3.add(24);
//      num3.add(25);
//      num3.add(26);
//      num3.add(27);
//      num3.add(28);
//      num3.add(29);
//      num4.add(30);
//      num4.add(31);
//      num4.add(32);
//      num4.add(33);
//      num4.add(34);
//      num4.add(35);
//      num4.add(36);
//      num4.add(37);
//      num4.add(38);
//      num4.add(39);
//      num5.add(40);
//      num5.add(41);
//      num5.add(42);
//      num5.add(43);
//      num5.add(44);
//      num5.add(45);

      // 각 자릿수별로 ArrayList 추가
      for (int i = 1; i <= 9; i++) {
         num1.add(i);
      }

      for (int i = 0; i <= 9; i++) {
         num2.add(i + 10);
         num3.add(i + 20);
         num4.add(i + 30);
      }

      for (int i = 0; i <= 5; i++) {
         num5.add(i + 40);
      }

      while (result) {
         System.out.print("고정할 숫자는 몇개 입니까?(0~5) : ");
         select = scan.nextInt();

         if (select >= 0 && select <= 5) {
            result = false;
         } else {
            System.out.println("숫자를 잘못 입력하였습니다.");
            System.out.println("다시 입력해주세요.");
            continue;
         }
      }

      if (select != 0) {
         result = true;
         System.out.println();
      }

      while (result) {
         for (int i = 0; i < select; i++) {
            System.out.print("고정할 숫자를 입력해주세요(1~45) : ");
            int selectnum = scan.nextInt();
            flotto.add(selectnum);
            if (flotto.get(i) >= 1 && flotto.get(i) <= 45) {
               num1.remove((Integer) selectnum);
               num2.remove((Integer) selectnum);
               num3.remove((Integer) selectnum);
               num4.remove((Integer) selectnum);
               num5.remove((Integer) selectnum);
               result = false;
            } else {
               System.out.println("숫자를 잘못 입력하였습니다.");
               System.out.println("다시 입력해주세요.");
               System.out.println();
               flotto.remove((Integer) selectnum);
               i--;
            }
         }
      }
      
      result = true;
      while (result) {
         System.out.print("제외할 숫자는 몇개 입니까?(0~10) : ");
         out = scan.nextInt();

         if (out >= 0 && out <= 10) {
            result = false;
         } else {
            System.out.println("숫자를 잘못 입력하였습니다.");
            System.out.println("다시 입력해주세요.");
            continue;
         }
      }

      if (out != 0) {
         result = true;
         System.out.println();
      }

      while (result) {
         for (int i = 0; i < out; i++) {
            System.out.print("제외할 숫자를 입력해주세요(1~45) : ");
            int outnum = scan.nextInt();
            if (outnum >= 1 && outnum <= 45) {
               num1.remove((Integer) outnum);
               num2.remove((Integer) outnum);
               num3.remove((Integer) outnum);
               num4.remove((Integer) outnum);
               num5.remove((Integer) outnum);
               result = false;
            } else {
               System.out.println("숫자를 잘못 입력하였습니다.");
               System.out.println("다시 입력해주세요.");
               System.out.println();
               i--;
            }
         }
      }

      result = true;

      // 각 배열별로 순서섞기
      Collections.shuffle(num1);
      Collections.shuffle(num2);
      Collections.shuffle(num3);
      Collections.shuffle(num4);
      Collections.shuffle(num5);

      // 10의 자리 중복 허용 수
      // 새로운 배열을 만들어 기존배열에서 사용할 수 있는 자릿수 만큼 선택
      while (result) {
         System.out.print("자릿수 중복 허용 수 (2~6): ");
         overlap = scan.nextInt();

         if (overlap < 2 && overlap > 6) {
            System.out.println("다시 입력해주세요");
            continue;
         } else {
            for (int i = 0; i < overlap; i++) {
               num11.add(num1.get(i));
               num22.add(num2.get(i));
               num33.add(num3.get(i));
               num44.add(num4.get(i));
               num55.add(num5.get(i));
            }
            result = false;
         }
      }

      // 합치기
      lotto.addAll(num11);
      lotto.addAll(num22);
      lotto.addAll(num33);
      lotto.addAll(num44);
      lotto.addAll(num55);
      
      System.out.println("연속된 숫자를 제외하시겠습니까?");
      System.out.println("1.O  2.X");
      System.out.print("번호 입력 : ");
      n1 = scan.nextInt();
      
      System.out.println("모든 수가 짝수 인 경우를 제외 하시겠습니까?");
      System.out.println("1.O  2.X");
      System.out.print("번호 입력 : ");
      n2 = scan.nextInt();
      
      System.out.println("모든 수가 홀수 인 경우를 제외 하시겠습니까?");
      System.out.println("1.O  2.X");
      System.out.print("번호 입력 : ");
      n3 = scan.nextInt();
      
    	  while (fresult) {
    		  // 순서 섞기
    		  Collections.shuffle(lotto);
    		  // 로또 번호
    		  for (int j = select; j < 6; j++) {
    			  flotto.add(lotto.get(j));
    		  }
    		  // 정렬
    		  Collections.sort(flotto);
    		  
    		  // 연속된 숫자 제외
    		  if(n1==1) {
    			  a=0;
    			  for(int j=0; j<5 ; j++) {
    				  if(flotto.get(j) == flotto.get(j+1)-1) {
    					  a++;
    				  }
    			  }
    			  if(a < 1) {
    				  fresult = false;
    			  } else {
    				  for(int j=select; j<6 ; j++) {
    					  flotto.remove(select);
    				  }
    				  continue;
    			  }
    		  }
    		  
    		  // 모든 수가 짝수인 경우 제외
    		  if(n2==1) {        	 
    			  a=0;
    			  for(int j=0; j<6 ; j++) {
    				  if((flotto.get(j))/2 == 0) {
    					  a++;
    				  }
    			  }
    			  if(a != 6) {
    				  fresult = false;
    			  } else if(a == 6){
    				  for(int j=select; j<6 ; j++) {
    					  flotto.remove(select);
    				  }
    				  continue;
    			  }
    		  }
    		  
    		  // 모든 수가 홀수인 경우 제외
    		  if(n3==1) {        	 
    			  a=0;
    			  for(int j=0; j<6 ; j++) {
    				  if((flotto.get(j))/2 == 1) {
    					  a++;
    				  }
    			  }
    			  if(a != 6) {
    				  fresult = false;
    			  } else if(a == 6){
    				  for(int j=select; j<6 ; j++) {
    					  flotto.remove(select);
    				  }
    				  continue;
    			  }
    		  }
    	  }
    	  // 출력
    	  System.out.println(flotto);
   }
}