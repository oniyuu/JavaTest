/*
 * 컬렉션 프레임워크
 * List : ArrayList, LinkedList
 */
package kr.co.job.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {

   public static void main(String[] args) {
      //
      ArrayList<String> list = new ArrayList<String>();
      list.add("딸기");
      list.add("포도");
      list.add("수박");
      list.add("복숭아");
      int num = list.size();
      System.out.println(num);
      for (int i = 0; i < num; i++) {
         System.out.println(i + "번째 데이터 : " + list.get(i));
      }
      System.out.println("============= [ 추 가 ]===================");
      list.add(2, "메로나");// 인덱스2 위치에 메로나를 추가합니다. Insert 삽입
      for (int i = 0; i < list.size(); i++) {
         System.out.println(i + "번째 데이터 : " + list.get(i));
      }
//      첫번째요소(index)의 데이터를 오렌지로 변경
      System.out.println("============= [ 변 경 ]===================");
      list.set(0, "오렌지");
      System.out.println("0번째 데이터 변경하기.");
      for (int i = 0; i < list.size(); i++) {
         System.out.println(i + "번째 데이터 : " + list.get(i));
      }
      System.out.println("============= [ 삭 제 ]===================");
//      두번째요소(index)의 데이터를 삭제
      list.remove(1); // list.remove("포도");
      for (int i = 0; i < list.size(); i++) {
         System.out.println(i + "번째 데이터 : " + list.get(i));
      }
      System.out.println("============= [ 검 색 ]===================");
      int index = list.indexOf("수박");
      System.out.println("찾은 위치 : " + index);
      index = list.lastIndexOf("수박");
      System.out.println("찾은 위치 : " + index);
      
      System.out.println("============= [ Iterator ]===============");
      Iterator<String> iter = list.iterator();	//컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화. list타입의 변수를 Iterator으로 변환
      while(iter.hasNext()) {	// 읽어올 요소가 남아있는지 확인하는 메소드. 요소가 있으면 true, 없으면 false
    	  System.out.println(iter.next());	//next() : 다음 데이터를 반환.
      }
      System.out.println("============= [ 향상된 for문 ]===============");
      for(String str:list) {	//for(타입 변수:배열)
    	  System.out.println(str);
      }

   }

}