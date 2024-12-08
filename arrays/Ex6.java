package arrays;
//p158
public class Ex6 {
	public static void main(String[] args) {
		//정렬해야 할 배열 
		int[] arr = {1,2,3,4,5,6,7,87,9,};
		
		//값을 치환하기 위한 임시변수
		int temp = 0;
		
		for(int i = arr.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				//앞의 값이 뒤의 값보다 크다면 정렬
				if(arr[j] > arr[j+1]) {
					//뒤의 값을 임시 변수에 저장
					temp = arr[j+1];
					arr[j+1] = arr[j] ;
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 출력 :");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		
			}
}
