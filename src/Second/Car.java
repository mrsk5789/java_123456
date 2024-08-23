package Second;

public class Car {

	//field
	int engine;
    String name;
	String color;
	String company;
	
	Car(){
	}	
	//오버로드 
	Car (String color){
		this.color=color;
	}
	
	
	
	Car (int engine, String name, String color, String company){
		this.engine =engine;
		this.name =name;
		this.color =color;
		this.company =company;
	}
	//method
	void go() {
	
	}
	
	void back() {
	}
}
