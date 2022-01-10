package level_1;

/* 
 * 코딩 테스트 연습
 * 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 * 핵심 내용 : 수학적으로 계산
 *  */

public class Divisor_Sum {
	public int solution(int n) {
        int answer = 0;
        
        if(n%Math.sqrt(n)==0)
            answer+=Math.sqrt(n);
        
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0)
                answer+=(i+n/i);
        }
        
        return answer;
    }
}
