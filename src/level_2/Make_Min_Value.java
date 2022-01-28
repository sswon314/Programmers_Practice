package level_2;

/* 
 * 코딩 테스트 연습
 * 최솟값 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12941
 * 핵심 내용 : 수학,배열
 *  */

import java.util.*;

public class Make_Min_Value {
	public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer=0;
        for(int i=0;i<A.length;i++){
            answer+=A[i]*B[B.length-1-i];
        }

        return answer;
    }
}
