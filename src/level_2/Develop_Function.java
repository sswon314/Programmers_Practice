package level_2;

/* 
 * 코딩 테스트 연습
 * 기능 개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * 핵심 내용 : 큐
 *  */

import java.util.*;

public class Develop_Function {
	public int[] solution(int[] progresses, int[] speeds) {        
        int[]remain=new int[progresses.length];
        for(int i=0;i<remain.length;i++){
            remain[i]=(int)Math.ceil((double)(100-progresses[i])/speeds[i]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer>list=new ArrayList<>();
        q.add(0);
        for(int i=1;i<remain.length;i++){
            if(remain[q.peek()]>=remain[i]){
                q.add(i);
            }
            else{
                list.add(q.size());
                while(q.size()>0)
                    q.remove();
                q.add(i);
            }
        }
        list.add(q.size());
        
        int[]answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
