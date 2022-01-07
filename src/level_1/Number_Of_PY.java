package level_1;

/* 
 * 코딩 테스트 연습
 * 문자열 내 p와 y의 개수
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 * 핵심 내용 : 문자열 내의 문자 개수 연산
 *  */

public class Number_Of_PY {
	boolean solution(String s) {
        int pNum=0,yNum=0;
        
        // 람다식으로도 풀 수 있으니 람다식에 대해 공부해볼 필요가 있다
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P')
                pNum++;
            else if(s.charAt(i)=='y'||s.charAt(i)=='Y')
                yNum++;
        }

        return pNum==yNum;
    }
}
