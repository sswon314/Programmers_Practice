package level_2;

/* 
 * 코딩 테스트 연습
 * 이진 변환 반복하기
 * https://programmers.co.kr/learn/courses/30/lessons/70129
 * 핵심 내용 : 문자열
 *  */

public class Repeat_Binary_Transformation {
	public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            int oldLength=s.length();
            s=s.replaceAll("0","");
            answer[1]+=oldLength-s.length();
            
            s=decTobin(s.length());
            answer[0]++;
        }
        return answer;
    }
    private String decTobin(int x){
        String result="";
        
        while(x>0){
            result+=(x%2==0)?"0":"1";
            x/=2;
        }
        
        return result;
    }
}
