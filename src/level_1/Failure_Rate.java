package level_1;

/* 
 * 코딩 테스트 연습
 * 실패율
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 * 핵심 내용 : ???(2차원 배열 정렬이 키포인트였다)
 *  */

import java.util.*;

public class Failure_Rate {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] rate = new double[N][2];
        int totalUserNum=stages.length;
        
        // 2차원 배열의 [n][1]은 실패한 유저의 수
        for(int i=0;i<stages.length;i++){
            if(stages[i]==N+1)
                continue;
            
            rate[stages[i]-1][1]+=1;
        }
        
        // [n][0]은 stage단계로 초기화, [n][0]은 실패율을 계산
        for(int i=0;i<N;i++){
            rate[i][0]=i+1;
            
            double userNum=rate[i][1];
            
            if(totalUserNum==0){
                rate[i][1]=0;
                continue;
            }
            rate[i][1]=userNum/totalUserNum;
            totalUserNum=totalUserNum-(int)userNum;
        }
        
        // 2차원 배열의 [n][1]를 내림차순으로 정렬([n][0]은 원래 오름차순으로 되어있어서 정렬 필요x)
        // 2차원 배열의 정렬에 대해 좀 더 공부해 볼 필요가 있다
        Arrays.sort(rate,(o1,o2)->Double.compare(o2[1],o1[1]));
        
        for(int i=0;i<N;i++){
            answer[i]=(int)rate[i][0];
        }
        
        return answer;
    }
}
