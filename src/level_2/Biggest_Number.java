package level_2;

/* 
 * 코딩 테스트 연습
 * 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * 핵심 내용 : 정렬
 *  */

import java.util.*;
public class Biggest_Number {
	public String solution(int[] numbers) {
        ArrayList<String> arr = new ArrayList<>();
        for (int number : numbers) {
            arr.add(String.valueOf(number));
        }
        arr.sort((num1, num2)-> (num2+num1).compareTo(num1+num2));     
        
        
        String answer = "";
        for(String s:arr)
            answer+=s;
        
        while(answer.length()>1&&answer.charAt(0)=='0'){
            answer=answer.substring(1);
        }
        
        return answer;
    }
    
    private int compareNumbers(int x, int y){
        return (Integer.toString(x)+Integer.toString(y)).compareTo(Integer.toString(y)+Integer.toString(x));
    }
}
