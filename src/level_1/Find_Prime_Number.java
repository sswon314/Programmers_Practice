package level_1;

/* 
 * 코딩 테스트 연습
 * 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * 핵심 내용 : 소수 찾기 알고리즘
 *  */

public class Find_Prime_Number {
	public int solution(int n) {
        int answer = 0;
        
        for(int i=2;i<=n;i++){
            boolean flag=true;
            int j=2;
            while(j<=Math.sqrt(i)){
                if(i%j==0){
                    flag=false;
                    break;
                }
                j++;
            }
            
            if(flag)
                answer++;
        }
        
        return answer;
    }
}
