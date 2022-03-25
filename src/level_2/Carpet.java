package level_2;

/* 
 * 코딩 테스트 연습
 * 카펫
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 * 핵심 내용 : 완전탐색
 *  */

public class Carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int tileNum=brown+yellow;
        
        for(int i=3;i<=Math.sqrt(tileNum);i++){
            if(tileNum%i==0){
                int height=i;
                int width=tileNum/i;
                
                if(brown==2*height+2*width-4){
                    answer[0]=width;
                    answer[1]=height;
                }
            }
        }
        return answer;
    }
}
