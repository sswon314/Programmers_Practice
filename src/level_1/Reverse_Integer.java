package level_1;

/* 
 * 코딩 테스트 연습
 * 정수 내림차순으로 정렬하기
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * 핵심 내용 : 정렬
 *  */

import java.util.*;

public class Reverse_Integer {
	public long solution(long n) {
        long answer = 0;
        String numberStr=String.valueOf(n);
        char[]charArr=numberStr.toCharArray();
        
        Arrays.sort(charArr);
        String str="";
        for(int i=charArr.length-1;i>=0;i--){
            str+=String.valueOf(charArr[i]);
        }
        answer=Long.parseLong(str);
        
        return answer;
    }
}
