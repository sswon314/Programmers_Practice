package level_2;

/* 
 * 코딩 테스트 연습
 * 오픈 채팅방
 * https://programmers.co.kr/learn/courses/30/lessons/42888
 * 핵심 내용 : 자료구조
 *  */

import java.util.*;

public class Open_Chatting_Room {
	public String[] solution(String[] record) {
        ArrayList<String>list=new ArrayList<>();
        
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<record.length;i++){
            String[]info=record[i].split(" ");
            
            if(info[0].equals("Enter")){
                list.add(info[1]+" "+"들어왔습니다.");
                map.put(info[1],info[2]);
            }
            else if(info[0].equals("Leave"))
                list.add(info[1]+" "+"나갔습니다.");
            else
                map.put(info[1],info[2]);
        }
        
        String[]answer=new String[list.size()];
        for(int i=0;i<list.size();i++){
            String[]token=list.get(i).split(" ");
            answer[i]=map.get(token[0])+"님이 "+token[1];
        }
        return answer;
    }
}
