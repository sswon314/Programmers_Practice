package level_1;

/* 
 * 코딩 테스트 연습
 * 비밀 지도
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 * 핵심 내용 : 비트 연산
 *  */

public class Screte_Map {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){
            answer[i]=numToString(n,arr1[i]|arr2[i]);
        }
        
        return answer;
    }
    
    public String numToString(int n, int x){
        String result="";
        for(int i=0;i<n;i++){
            if(x%2==0)
                result+=" ";
            else
                result+="#";
            
            x/=2;
        }
        
        return new StringBuffer(result).reverse().toString();
    }
}
