package level_1;

/* 
 * 코딩 테스트 연습
 * 시저 암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 * 핵심 내용 : 아스키코드를 이용해서 문자 연산
 * 다시 연습해보기
 *  */

public class Ceasar_Encryption {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            int oldValue=(int)s.charAt(i);
            int newValue=32;
            
            if(oldValue>=97&&oldValue<=122)
            	// newValue=(oldValue+n-97)%26+97;
                newValue=(oldValue+n)>122?(oldValue+n)%122+96:oldValue+n;
                
            else if(oldValue>=65&&oldValue<=90)
            	// newValue=(oldValue+n-65)%26+65;
                newValue=(oldValue+n)>90?(oldValue+n)%90+64:oldValue+n;
            
            answer+=String.valueOf((char)newValue);
        }
        
        return answer;
    }
}
