package kr.co.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class lotto3 {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int[] lotto = new int[6];
      int[] out = null;
      int count=1;
      int no=0;
      int sel = 0;
      
      boolean check = true;
      
      boolean result = true;
      boolean result2 = true;
      boolean result3 = true;
      

      if (sel != 0) {
         result = true;
         System.out.println();
      }
      
      while (result) {
         
         check = true;
         System.out.print("고정할 숫자는 몇개 입니까?(0~5) : ");
         sel = scan.nextInt();
         
         if (sel >= 0 && sel <=5) {
            result = false;
         } else {
            System.out.println("숫자를 잘못 입력하였습니다.");
            System.out.println("다시 입력해주세요.");
            continue;
         }
         
         while(check) {
            count = 1;
            for(int i =0; i<sel; i++) {
               System.out.print("고정할 숫자를 입력해주세요(1~45) : ");
               lotto[i] = scan.nextInt();
               if (lotto[i] < 1 ||  lotto[i] >45) {
                  i--;
                  System.out.println("잘못 입력하였습니다. 재입력해주세요.");
               }
               else {
                  System.out.println("lotto["+i+"]의 값:"+lotto[i]);
                  if(count == sel) {
                     check = false;
                     result = true;
                  }
                  count++;
               }
            }
            
            for(int j =0; j<sel; j++) {
               for(int k=j+1; k<sel; k++) {
                  if(lotto[j]==lotto[k]) {
                     System.out.println("잘못한듯");
                     check = true;
                  }
               }
            }
         }   
         result = false;
      }   
      
      while (result2) {
         System.out.print("제외할 숫자는 몇개 입니까?(0~38) : ");
         no = scan.nextInt();
         if (no >= 0 && no <=38) {
            out = new int[no];
            result2 = false;
         } else {
            System.out.println("숫자를 잘못 입력하였습니다.");
            System.out.println("다시 입력해주세요.");
            continue;
         }
      }
      if (no != 0) {
         result2 = true;
         System.out.println();
      }
      
      while (result3) {
         for(int i=0 ; i<no ; i++) {//n : 선택수 제외
            System.out.print("제외수를 입력하세요(1~45) : ");
            out[i] = scan.nextInt();
            
            if (sel != 0) {
               for(int j=0 ; j<sel ; j++) {
                  if (out[i] == lotto[j]) {
                     System.out.println("선택한 숫자와 중복됩니다.");
                     System.out.println("다시 입력해주세요.");
                     System.out.println();
                     i--;
                     break;
                  } else {
                     if (out[i] >= 1 && out[i] <=45) {
                        result3 = false;
                     } else {
                        System.out.println("숫자를 잘못 입력하였습니다.");
                        System.out.println("다시 입력해주세요.");
                        System.out.println();
                        i--;
                        break;
                     }
                  }
               }
            } else {
               if (out[i] >= 1 && out[i] <=45) {
                  result3 = false;
               } else {
                  System.out.println("숫자를 잘못 입력하였습니다.");
                  System.out.println("다시 입력해주세요.");
                  System.out.println();
                  i--;
               }
            }
         }
      }
      
      boolean result4 = true;
      result4 = true;
      
      while(result4) {
         for(int i=sel; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;
            // 제외수
            for(int j=0 ; j<no; j++) {
               if(lotto[i] == out[j]) {
                  i--;
                  break;
               }
            }
            // 중복 번호 제거
            for(int j=0; j<i; j++) {
               if(lotto[i] == lotto[j]) {
                  i--;
                  break;   
               }
            }
         }
         
         //정렬
         Arrays.sort(lotto);
         
         System.out.println("제외 패턴을 선택");
         System.out.println("1.패턴없음  2.모두 짝수인 경우 제외  3.모두 홀수인 경우제외  4.모두 짝수와 홀수인 경우 제외");
         System.out.print("번호입력 : ");
         sel=scan.nextInt();
         System.out.println();
         
         switch(sel) {
         case 1:
            System.out.println(Arrays.toString(lotto));
            result4 = false;
            break;
         case 2:
            //모두 짝수가 아닐때
            if (!(lotto[0]/2==0 && lotto[1]/2==0 && lotto[2]/2==0&&lotto[3]/2==0&&lotto[4]/2==0&&lotto[5]/2==0)) {
               System.out.println(Arrays.toString(lotto));
               result4 = false;
            }
            break;
         case 3:
            //모두 홀수가 아닐때 출력
            if (!(lotto[0]/2==1&&lotto[1]/2==1&&lotto[2]/2==1&&lotto[3]/2==1&&lotto[4]/2==1&&lotto[5]/2==1)) {
               System.out.println(Arrays.toString(lotto));
               result4 = false;
            }
            break;
         case 4:
            //모두 짝수와 홀수가 아닐때 출력
            if (!(lotto[0]/2==0 && lotto[1]/2==0 && lotto[2]/2==0&&lotto[3]/2==0&&lotto[4]/2==0&&lotto[5]/2==0)||!(lotto[0]/2==1&&lotto[1]/2==1&&lotto[2]/2==1&&lotto[3]/2==1&&lotto[4]/2==1&&lotto[5]/2==1)) {
               System.out.println(Arrays.toString(lotto));
               result4 = false;
            }
            break;
         default:
            System.out.println("숫자를 다시 입력해주세요.");
            System.out.println();
         }
      }
   }
}