import java.util.ArrayList;
import java.util.Collections;

// 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
// 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.

// <제한사항>
// 배열의 길이는 10만 이하입니다.
// 배열의 원소는 0 이상 10만 이하인 정수입니다.

// 예시1
// 입력이 [4, 1, 3, 2]가 주어진 경우, 배열의 길이가 4이므로 배열에는 1부터 4까지 숫자가 모두 들어 있어야 합니다.
// [4, 1, 3, 2]에는 1부터 4까지의 숫자가 모두 들어 있으므로 true를 반환하면 됩니다.

// 예시2
// [4, 1, 3]이 주어진 경우, 배열의 길이가 3이므로 배열에는 1부터 3까지 숫자가 모두 들어 있어야 합니다.
// [4, 1, 3]에는 2가 없고 4가 있으므로 false를 반환하면 됩니다.


public class CheckingArray {
	
	public boolean solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean answer = true;
		int length = arr.length;

        for(int i=0; i<length; i++) {
        	list.add(arr[i]);
        }
        Collections.sort(list);
        
        for(int i=0; i<length; i++){
            
        	if(list.get(i) != (i+1)) {
        		answer = false;
        		return answer;
        	} else if(list.get(i) > length){
                answer = false;
                return answer;
            }
        }
        return answer;
    }
	
	
	public static void main(String args[]) {
	
		CheckingArray cA = new CheckingArray();
		int[] arr = {1,4,2,3};

		System.out.println(cA.solution(arr));
		
	}
}
