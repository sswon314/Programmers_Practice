package level_1;

/* 
 * 코딩 테스트 연습
 * 없는 숫자 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/86051
 * 핵심 내용 : 수학적으로 계산
 *  */

public class Add_Not_In_Numbers {
	public int solution(int[] numbers) {
        int answer = 0;
        
        int[]nums=new int[10];
        for(int i=0;i<numbers.length;i++){
            nums[numbers[i]]++;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                answer+=i;
        }
        
        // 애초에 0~9의 숫자가 하나씩 나오므로 모두 더한 45에서 주어지는 숫자의 값을 빼는 방식으로 풀수 있다
        // int answer=45;
        // for(int i=0;i<numbers.length;i++) {
        	// answer-=numbers[i];
        // }
        return answer;
    }
}
