package level_1;

/* 
 * 코딩 테스트 연습
 * 부족한 금액 구하기
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 * 핵심 내용 : 1부터 n까지의 합 계산
 *  */

public class Not_Enough_Money {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long need=price*((long)count*((long)count+1)/2);
        
        answer=need-money;
        
        return answer>0?answer:0;
    }
}
