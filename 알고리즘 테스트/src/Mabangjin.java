// 마방진 = 모든 가로행, 세로열의 합이 같다.
// 2차원 배열에서 0행 가운데 인덱스에서부터 시작한다. (단 배열의 크기는 홀수여야하며, 동일해야한다.)
// -1행 +1열로 1씩 숫자값이 증가한다.
// 숫자가 배열 크기의 배수이면 행만 +1 증가한다.
// 행이 0보다 작은 인덱스이면 마지막 행으로 이동한다.
// 열이 마지막 열이면 0번째 열로 이동한다.

public class Mabangjin {
	
	public int[][] solution(int arr[][]) {
		
		int length = arr.length;			// 배열의 길이
		int totalLength = length * length;	// 2차원 전체 배열의 길이
		int row = 0;						// 행값 초기화
		int column = length / 2;			// 중간열에서 시작
		int number;							// 입력될 숫자
		
		for(number = 1; number <= totalLength; number++) {
			
			arr[row][column] = number;		// 배열에 숫자 입력
			
			if(number % length == 0) {		// 숫자가 배열 길이의 배수이면 행+1 후에 반복문 처음으로 이동
				row++;
				continue;
			}
			
			row--;							// 행-1;
			column++;						// 열+1;
			
			if(row < 0) {					// 행의 인덱스가 0보다 작으면 마지막 인덱스로 이동
				row = length-1;
			}
			
			if(column > length-1) {			// 열의 인덱스가 마지막 인덱스보다 커지면 0으로 이동
				column = 0;
			}
					
		}
		return arr;							// 배열 리턴
	}
	
	
	public static void main(String[]args) {
		
		int[][] arr = new int[5][5];			// 2차원 배열 선언(홀수 크기)
		int[] arrCol = new int[arr.length];		// 열의 합을 입력할 배열 선언
		int sumRow;								// 행의 합 선언
		int sumCol;								// 열의 합 선언
		
		Mabangjin answer = new Mabangjin();		// 클래스 선언
		answer.solution(arr);					// 마방진 구현 메소드 실행
		
		for(int i = 0; i < arr.length; i++) {
			sumRow = 0;							// 행의 합 초기화
			sumCol = 0;							// 열의 합 초기화
			for(int j = 0; j < arr.length; j++) {
				sumRow += arr[i][j];			// 행의 합 누적
				sumCol += arr[j][i];			// 열의 합 누적
				System.out.print(arr[i][j] + "\t");
			}
			arrCol[i] = sumCol;					// 열의 값을 해당 인덱스의 arrCol 배열에 입력
			System.out.println("= " + sumRow);	// 행의 합 출력
		}
		
		System.out.println();
		
		for(int i = 0; i < arrCol.length; i++) {
			System.out.print(arrCol[i] + "\t");	// 열의 합 출력
		}
	}
	
}
