package level_1;

/* 
 * 코딩 테스트 연습
 * 2016년
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 * 핵심 내용 : 수학적으로 계산
 *  */

public class Year_2016 {
	public String solution(int a, int b) {
        String answer = "";
        String[]days={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[]dayCnt={31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDays=b-1;
        
        for(int i=0;i<a-1;i++){
            totalDays+=dayCnt[i];
        }
        answer=days[(5+totalDays)%7];
        
        return answer;
    }
}
