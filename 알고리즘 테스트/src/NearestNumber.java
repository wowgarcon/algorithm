import java.util.*;

// 10개의 정수를 입력받아 배열에 저장한 후 기준수에 가장 가까운 값 찾기
// 단, 근사값이 2개인 경우에는 나중에 찾은 값을 출력한다.
// 정수의 범위는 0~100으로 한다.

public class NearestNumber {
	
	public int solution(int number, int[] arr) {
		
		int min = 100;	
		int gap = 0;
		int answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			gap = Math.abs(number - arr[i]); 
			
			if(gap <= min) {
				min = gap;
				answer = arr[i];
			}
		}
		return answer;
    }
	
	
	public static void main(String args[]) {
		NearestNumber nN = new NearestNumber();
		Scanner scan = new Scanner(System.in);

		System.out.print("기준이 될 숫자를 입력하세요 : ");	// 숫자 입력
		int number = scan.nextInt();
		int i = 0;
		int[] arr = new int[10];
		
		while(number < 0) {
			System.out.print("양수만 입력 가능합니다 : ");	// 양수 확인
			number = scan.nextInt();
		}
		
		while(i < 10) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			arr[i] = scan.nextInt();
			
			if(arr[i] == number) {							// 기준수와 동일여부 확인
				System.out.println("기준수와 같은 숫자는 입력할 수 없습니다.");
				continue;
			}else if(arr[i] < 0 || arr[i] > 100) {			// 양수 확인
				System.out.println("입력범위를 벗어났습니다.");
				continue;
			}
			i++;
		}
		System.out.println("결과 = " + nN.solution(number, arr));	// 함수 실행 및 출력
	}
}
