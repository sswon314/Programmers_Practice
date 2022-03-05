package level_2;

/* 
 * 코딩 테스트 연습
 * 위장
 * https://programmers.co.kr/learn/courses/30/lessons/42578?language=java
 * 핵심 내용 : 해쉬
 *  */

import java.util.*;

public class Camouflage {
	public int solution(String[][] clothes) {
        Hashtable<String,Integer>hash=new Hashtable<>();
        for(int i=0;i<clothes.length;i++){
            if(!hash.containsKey(clothes[i][1])){
                hash.put(clothes[i][1],1);
            }
            else{
                hash.put(clothes[i][1],hash.get(clothes[i][1]).intValue()+1);
            }
        }
        
        int answer = 1;
        for(Integer i : hash.values()){
            answer*=(i.intValue()+1);
        }
        
        return answer-1;
    }
}
