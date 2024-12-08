package method;
//result를 반환하는 메서드 정의
public class EX8 {	
	
	public int sum(int [] nums) {
			int result = 0;
			for(int i = 0; i < nums.length; i++) {
				result += nums[i];		//매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더한다
			}
		
			return result;
		
	}
	
//result를 반환하는 메서드 호출
	public static void main(String[] args) {
		int nums[] = {500, 200};	//배열생성
		EX8 calc = new EX8();			//객체생성
		//calc 인스턴스의 sum 메서드를 호출하여 return된 결과값을 출력
		System.out.println("숫자들의 합은" + calc.sum(nums) + "입니다.");
	}
	//결과 값을 저장할 변수의 자료형은 결과값의 자료형과 동일하거나 자동 형 변환이 될 수 있는 자료형이어야 한다
	
}
