package level_2;

/* 
 * 코딩 테스트 연습
 * n^2 배열 자르기
 * https://programmers.co.kr/learn/courses/30/lessons/87390
 * 핵심 내용 : 수학
 *  */

public class Cut_N2_Array {
	public int[] solution(int n, long left, long right) {
        int[]answer=new int[(int)(right-left+1)];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)((left+i)/n)>(int)((left+i)%n)?(int)((left+i)/n)+1:(int)((left+i)%n)+1;
        }
        
        return answer;
    }
}
