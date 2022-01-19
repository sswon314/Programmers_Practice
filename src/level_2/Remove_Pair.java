package level_2;

/* 
 * 코딩 테스트 연습
 * 짝지어 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12973
 * 핵심 내용 : 스택
 *  */

import java.util.*;

public class Remove_Pair {
	public int solution(String s)
    {
        if(s.length()%2!=0)
            return 0;
        
        Stack<Character>stk=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(stk.empty())
                stk.push(s.charAt(i));
            
            else if(s.charAt(i)==stk.peek())
                stk.pop();
            
            else stk.push(s.charAt(i));
        }
        
        int answer=stk.size()==0?1:0;
        return answer;
    }
}
