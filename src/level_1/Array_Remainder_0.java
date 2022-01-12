package level_1;

/* 
 * 코딩 테스트 연습
 * 나누어 떨어지는 숫자 배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 * 핵심 내용 : 배열
 *  */

import java.util.*;

public class Array_Remainder_0 {
	// 반환값을 ArrayList로 했는데 원래는 int[]로 풀어야 함 -> 추후 수정 필요
	public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer=new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0)
                answer.add(arr[i]);
        }
        
        if(answer.size()==0)
            answer.add(-1);
        
        return answer;
    }
}
