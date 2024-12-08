package constructor;

public class Person {//클래스 선언
	
	
	String name;
	int age;
	
	Person(String n, int a){	//매개변수를 2개 받는 생성자
		name = n;
		age = a;
	}
	
	void introduce() {
		System.out.println("안녕하세요. 저는" + age + "세" + name + "입니다");
	}
	
}
