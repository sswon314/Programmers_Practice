package level_1;

/* 
 * 코딩 테스트 연습
 * 신고 결과 받기
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 * 핵심 내용 : 리스트
 *  */

import java.util.*;
public class Get_Report_Result {
	public int[] solution(String[] id_list, String[] report, int k) {		
		Hashtable<String,ArrayList<String>>table=new Hashtable<>();
		for(int i=0;i<report.length;i++) {
			String[]info=report[i].split(" ");
			
			if(!table.containsKey(info[0])) 
				table.put(info[0], new ArrayList<>());
			
            if(!table.get(info[0]).contains(info[1]))
				table.get(info[0]).add(info[1]);
            
		}
		
		Hashtable<String,Integer>reportCnt=new Hashtable<>();	
		for(int i=0;i<id_list.length;i++) {
			reportCnt.put(id_list[i], 0);
		}
		
		for(int i=0;i<id_list.length;i++) {
			if(table.containsKey(id_list[i])) {
				for(String s : table.get(id_list[i])) {
					reportCnt.replace(s,new Integer(reportCnt.get(s).intValue()+1));
				}
			}
		}
		
		int[]answer=new int[id_list.length];
		for(int i=0;i<id_list.length;i++) {
			if(table.containsKey(id_list[i])) {
				for(String s:table.get(id_list[i])) {
					if(reportCnt.get(s).intValue()>=k) {
						answer[i]++;
					}
				}
			}
		}
        
        return answer;
    }
}
