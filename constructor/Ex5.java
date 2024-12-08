package constructor;
//오버로딩
public class Ex5 {
	public static void main(String[] args) {
		Book b1 = new Book();	//생성자 1
		System.out.println("b1.title :" + b1.title); 
		System.out.println("b1.serise :" + b1.series); 
		System.out.println("b1.page :" + b1.page); 
		
		Book b2 = new Book("제목1");	//생성자 2
		System.out.println("b2.title :" + b1.title); 
		System.out.println("b2.serise :" + b1.series); 
		System.out.println("b2.page :" + b1.page); 
		
		Book b3 = new Book();	//생성자 3
		System.out.println("b3.title :" + b1.title); 
		System.out.println("b3.serise :" + b1.series); 
		System.out.println("b3.page :" + b1.page); 
		
		Book b4 = new Book();	//생성자 4
		System.out.println("b4.title :" + b1.title); 
		System.out.println("b4.serise :" + b1.series); 
		System.out.println("b4.page :" + b1.page); 
		
	}
	
	
}
