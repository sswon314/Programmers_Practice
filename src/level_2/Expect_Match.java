package level_2;

/* 
 * 코딩 테스트 연습
 * 예상 대진표
 * https://programmers.co.kr/learn/courses/30/lessons/12985
 * 핵심 내용 : 수학
 *  */

public class Expect_Match {
	public int solution(int n, int a, int b)
    {
        a-=1;
        b-=1;
        
        int answer=1;
        while(a/2!=b/2){
            a/=2;
            b/=2;
            answer++;
        }

        return answer;
    }
}
