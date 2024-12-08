package constructor;

public class Phone {//클래스 선언
	
	
	String brand;
	int serise;
	String color = "검정색";
	
	Phone(String b, int s, String c){	//매개변수를 3개받는 생성자
		brand = b;
		serise = s;
		color =c;
		
	}
		
	Phone(String b, int s){	//매개변수를 2개 받는 생성자
		brand = b;
		serise = s;
		
	}
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + serise);
	}
	
}
