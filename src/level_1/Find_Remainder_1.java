package level_1;

/* 
 * 코딩 테스트 연습
 * 나머지가 1이 되는 수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/87389
 * 핵심 내용 : %연산자 이용
 *  */

public class Find_Remainder_1 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<n;i++){
            if(n%i==1){
                answer=i;
                break;
            }
        }
        return answer;
    }
}
