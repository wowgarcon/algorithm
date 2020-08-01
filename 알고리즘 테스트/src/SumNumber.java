import java.util.*;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를 들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

//<제한사항>
//N의 범위 : 100,000,000 이하의 자연수

public class SumNumber {
	
	public int solution(int number) {
        int length = Integer.toString(number).length();	// 자릿수 구하기
        int answer = 0;
        
        for(int i=1; i<=length; i++) {
        	int mok = (int)(number / Math.pow(10, length-i));
        	int namerge = (int)(number - mok * Math.pow(10, length-i));
        	
        	answer += mok;
        	number = namerge; 
        }
        return answer;
    }
	
	
	public static void main(String args[]) {
		SumNumber sN = new SumNumber();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");	// 숫자 입력
		int number = scan.nextInt();
		
		if(number > 100000000) {	// 제한사항 처리
			while(number > 100000000) {
				System.out.println("숫자가 너무 큽니다.");
				System.out.print("숫자를 다시 입력하세요 : ");
				number = scan.nextInt();
			}
		}
		
		System.out.println("결과 = " + sN.solution(number));	// 함수 실행 및 출력
	}
}
