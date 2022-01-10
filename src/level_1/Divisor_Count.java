package level_1;

/* 
 * 코딩 테스트 연습
 * 약수의 개수와 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 * 핵심 내용 : 수학
 *  */

public class Divisor_Count {
	public int solution(int left, int right) {
        int answer=0;
        
        // 이렇게 간단하게 할 수 있었다
        // 약수의 개수가 홀수 = 제곱수
        // 약수의 개수가 짝수 = 그외
        // for(int i=left;i<=right;i++){
        //     if (i % Math.sqrt(i) == 0)
        //         answer-=i;
        //     else
        //         answer+=i;
        // }
        
        for(int i=left;i<=right;i++){
            if(divisorCount(i)%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;
    }
    
    public int divisorCount(int x){
        int result=0;
        
        for(int i=1;i<=x;i++){
            if(x%i==0)
                result++;
        }
        
        return result;
    }
}
