package level_1;

/* 
 * 코딩 테스트 연습
 * 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 * 핵심 내용 : 배열
 *  */

import java.util.*;

public class Not_Same_Number {
	public int[] solution(int []arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int index=0;
        list.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(list.get(index)==arr[i])
                continue;
            else{
                list.add(arr[i]);
                index++;
            }
        }
        
        int[]answer=new int[list.size()];
        int j=0;
        for(int x:list)
            answer[j++]=x;
        
        return answer;
    }
}
