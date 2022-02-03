package level_2;

/* 
 * 코딩 테스트 연습
 * JadenCase 문자열 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12951
 * 핵심 내용 : 문자열
 *  */

public class JadenCase {
	public String solution(String s) {
        String answer = "";
        String[]token=s.split(" ");
        
        for(int i=0;i<token.length;i++){
            if(token[i].length()>0){
                token[i]=token[i].toLowerCase();
                token[i]=token[i].substring(0,1).toUpperCase()+token[i].substring(1);
            }
            answer+=token[i]+" ";
        }
        
        
        if(!(s.charAt(s.length()-1)==' ')){
            answer=answer.substring(0,answer.length()-1);
        }
        return answer;
    }
}
