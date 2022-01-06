package level_1;

/* 
 * 코딩 테스트 연습
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840;
 * 핵심 내용 : 완전탐색(완전탐색이라는데 잘 모르겠음)
 *  */

import java.util.*;

public class Mock_Test {
    public ArrayList<Integer> solution(int[] answers) {
        int[][]student={
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        int[]cnt={0,0,0};
        
        for(int i=0;i<answers.length;i++){
            int[]index={i%student[0].length,i%student[1].length,i%student[2].length};
            
            for(int j=0;j<index.length;j++){
                if(answers[i]==student[j][index[j]])
                    cnt[j]++;
            }
            
        }
        
        int maxValue=Math.max(cnt[0],cnt[1]);
        maxValue=Math.max(maxValue,cnt[2]);
        
        ArrayList<Integer>answer=new ArrayList<>();
        for(int i=0;i<cnt.length;i++){
            if(maxValue==cnt[i])
                answer.add(i+1);
        }
        
        return answer;
    }
}
