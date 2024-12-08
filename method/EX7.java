package method;
//매개변수를 배열로 받는 메서드 정의 
public class EX7 {	
	
	void sum(int [] nums) {
			int result = 0;
			for(int i = 0; i < nums.length; i++) {
				result += nums[i];		//매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더한다
			}
		
			System.out.println("숫자들의 합은" + result + "입니다");
		
	}
	
//매개변수를 배열로 받는 메서드 호출
	public static void main(String[] args) {
		int nums[] = {100, 200};	//배열생성
		EX7 calc = new EX7();			//객체생성
		calc.sum(nums); 		//calc 인스턴스의 sum 메서드 호출
	}
	
}
