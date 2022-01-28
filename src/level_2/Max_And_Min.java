package level_2;

/* 
 * 코딩 테스트 연습
 * 최댓값과 최솟값
 * https://programmers.co.kr/learn/courses/30/lessons/12939
 * 핵심 내용 : 문자열
 *  */

public class Max_And_Min {
	 public String solution(String s) {
	        String[]strArr=s.split(" ");
	        int[]numArr=new int[strArr.length];
	        
	        for(int i=0;i<strArr.length;i++){
	            numArr[i]=Integer.parseInt(strArr[i]);
	        }
	        
	        int min=numArr[0],max=numArr[0];
	        for(int i=1;i<numArr.length;i++){
	            min=Math.min(min,numArr[i]);
	            max=Math.max(max,numArr[i]);
	        }
	        
	        String answer=String.valueOf(min)+" "+String.valueOf(max);
	        return answer;
	    }
}
