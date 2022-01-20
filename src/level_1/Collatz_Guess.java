package level_1;

/* 
 * 코딩 테스트 연습
 * 콜라츠 추측
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * 핵심 내용 : 수학
 *  */

public class Collatz_Guess {
	public int solution(long num) {
        int answer = 0;
        
        while(num!=1){
            if(answer==500)
                return -1;
            
            if(num%2==0)
                num=num/2;
            else
                num=num*3+1;
            
            answer++;
        }
        return answer;
    }
}
