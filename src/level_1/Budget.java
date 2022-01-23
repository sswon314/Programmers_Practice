package level_1;

/* 
 * 코딩 테스트 연습
 * 예산
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 * 핵심 내용 : 그리디 알고리즘
 *  */

import java.util.*;

public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++){
            budget-=d[i];
            if(budget<0)
                break;
            
            answer++;
        }
        return answer;
    }
}
