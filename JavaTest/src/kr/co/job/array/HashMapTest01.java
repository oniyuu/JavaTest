package kr.co.job.array;

import java.util.HashMap;

public class HashMapTest01 {

	public static void main(String[] args) {
		// Map 클래스 [인덱스, 내용] -HashMap
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("한국", "서울");
		map.put("한국2", "서울2");
		map.put("한국3", "서울3");
		map.put("한국4", "서울4");
		map.put("한국5", "서울5");
		
		String tmp = map.get("한국3");
		System.out.println(tmp);
		
	}

}
