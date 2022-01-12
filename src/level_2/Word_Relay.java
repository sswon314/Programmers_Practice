package level_2;

/* 
 * 코딩 테스트 연습
 * 영어 끝말잇기
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 * 핵심 내용 : 문자열
 *  */

import java.util.*;

public class Word_Relay {
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String,Integer>usedWord=new HashMap<String,Integer>();
        int failed=0;
        int[] cnt=new int[n];
        String oldValue;
        
        cnt[0]++;
        usedWord.put(words[0],1);
        oldValue=words[0];
    
        for(int i=1;i<words.length;i++){
            cnt[i%n]++;
            if(words[i].charAt(0)!=oldValue.charAt(oldValue.length()-1)){
                failed=(i%n)+1;
                break;
            }
            if(usedWord.containsKey(words[i])){
                failed=(i%n)+1;
                break;
            }
            usedWord.put(words[i],1);
            oldValue=words[i];
        }
        
        if(failed==0){
            answer[0]=failed;
            answer[1]=0;
        }
        else{
            answer[0]=failed;
            answer[1]=cnt[(answer[0]-1)%n];
        }
        
        return answer;
    }
}
