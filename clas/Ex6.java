package clas;

public class Ex6 {//클래스 선언
		public static void main(String[] args) {
				
			Student stu1 = new Student();
			stu1.studentName = "홍길동";
			stu1.hello();
			System.out.println("학교는" + Student.schoolName + "입니다.");
			Student.goToSchool();
			
			Student stu2 = new Student();
			stu2.studentName = "고길동";
			stu2.hello();
			System.out.println("학교는" + Student.schoolName + "입니다.");
			Student.goToSchool();
			
			
		}
}
