package level_1;

/* 
 * 코딩 테스트 연습
 * x만큼 간격이 있는 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 * 핵심 내용 : 반복문
 *  */

public class Number_Of_Interval {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=1;i<=n;i++){
            answer[i-1]=(long)x*i;
        }
        
        return answer;
    }
}
