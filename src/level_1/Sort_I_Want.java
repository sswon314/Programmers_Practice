package level_1;

/* 
 * 코딩 테스트 연습
 * 문자열 내 마음대로 정렬하기
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 * 핵심 내용 : comparator이용
 *  */

import java.util.*;
public class Sort_I_Want {
	public String[] solution(String[] strings, int n) {        
        Arrays.sort(strings, new Comparator<String>() {
	        @Override
	        public int compare(String o1, String o2) {
                char c1=o1.charAt(n),c2=o2.charAt(n);
                if(c1-c2==0){
                    return o1.compareTo(o2);
                }
                return c1-c2;
	        }
        });
        return strings;
    }
}
