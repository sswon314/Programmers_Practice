package level_1;

/* 
 * 코딩 테스트 연습
 * 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 핵심 내용 : 해쉬맵으로 효율성 생각하기
 *  */

import java.util.*;

class Cannot_Goal_Player {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer>list=new HashMap<>();
        for(int i=0;i<participant.length;i++){
            if(list.containsKey(participant[i]))
                list.put(participant[i],list.get(participant[i])+1);
            else
                list.put(participant[i],1);
        }
        
        for(int i=0;i<completion.length;i++){
            if(list.get(completion[i])==1)
                list.remove(completion[i]);
            else
                list.put(completion[i],list.get(completion[i])-1);
        }
        
        for (String key : list.keySet())
            answer=key;
        return answer;
    }
}
