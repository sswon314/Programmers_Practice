package level_1;

/* 
 * 코딩 테스트 연습
 * 최소 직사각형
 * https://programmers.co.kr/learn/courses/30/lessons/86491
 * 핵심 내용 : 최대 최소값으로 계산
 *  */

public class Minimum_Rectangle {
	public int solution(int[][] sizes) {
        int answer = 0;
        
        int temp;
        int widthMax=0,heightMax=0;
        for(int i=0;i<sizes.length;i++){
            // if(sizes[i][0]<sizes[i][1]){
                // temp=sizes[i][0];
                // sizes[i][0]=sizes[i][1];
                // sizes[i][1]=temp;
            // }
            
            // 위에서 긴것을 가로로, 짧은 것을 세로로 변경하지말고
            // 애초에 긴것, 짧은 것을 바로 이용한다
            int max=Math.max(sizes[i][0], sizes[i][1]);
            int min=Math.min(sizes[i][0], sizes[i][1]);
            if(widthMax<max)
                widthMax=max;
            if(heightMax<min)
                heightMax=min;
        }
        answer=widthMax*heightMax;
        
        return answer;
    }
}
