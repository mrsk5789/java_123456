package ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		
		Language language1=new Language("korean",82);
		
		System.out.println(language1.name);
		
		List<Language>list=new ArrayList<>();
		
		list.add(language1);
		
		Language language2=new Language("USA",10);
		Language language3=new Language("JAPAN",10);
		
		list.add(language2);
		list.add(language3);
		
		list.add(new Language("England",15));
		
		Car car=new Car("Hyndal",222);
		
		List<Car>list2=new ArrayList<>();
		
		list2.add(car);
		
		list.get(3).name="UK";
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("list.get("+i+").name:"+list.get(i).name);
		}
		for(Language language: list) {
			System.out.println("language.name:"+language.name);
			
		}

	}

}
