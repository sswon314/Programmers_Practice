package level_2;

/* 
 * 코딩 테스트 연습
 * 올바른 괄호
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 * 핵심 내용 : 문자열
 *  */

import java.util.*;
public class Correct_Parenthesis {
	boolean solution(String s) {
        boolean answer = true;

        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push('(');
            }
            else{
                if(stk.isEmpty())
                    return false;
                else
                    stk.pop();
            }
        }
        
        return stk.isEmpty()?true:false;
    }
}
