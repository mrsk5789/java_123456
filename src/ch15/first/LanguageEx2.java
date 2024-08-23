package ch15.first;

import java.util.ArrayList;

public class LanguageEx2 {

	public static void main(String[] args) {
		
		ArrayList<Language>languages =new ArrayList<>();
		
		languages.add(new Language("korean",11));
		languages.add(new Language("USA",21));
		languages.add(new Language("UK",22));
		languages.add(new Language("Japan",98));
		
		for(int i=0; i<languages.size(); i++) {
			System.out.println("languages.get("+i+").name:");
		}
		
		System.out.println("--------------------------");
		
		for(Language language: languages) {
			System.out.println("language");
		}
		
		

	}

}
