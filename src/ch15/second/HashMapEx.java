package ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer>map=new HashMap<String,Integer>();
		
		map.put("영어",100);
		map.put("수학", 93);
		
		map.forEach((key, value)->{
			System.out.println(key+":"+value);
		});
		
		System.out.println("----------------------------");
		
		for(String strKey : map.keySet()) {
			Integer strValue=map.get(strKey);
			System.out.println(strKey+":"+strValue);
		}
		
	}

}
//list:array의 연장
//map: key와 value구조