package level_2;

/* 
 * 코딩 테스트 연습
 * 피보나치 수
 * https://programmers.co.kr/learn/courses/30/lessons/12945
 * 핵심 내용 : 수학
 *  */

public class Fibonacci {
    public int solution(int n) {
        int[] fibonacci=new int[n+1];
        fibonacci[0]=0;
        fibonacci[1]=1;
        
        for(int i=2;i<=n;i++){
            fibonacci[i]=(fibonacci[i-1]%1234567+fibonacci[i-2]%1234567)%1234567;
        }
        
        return fibonacci[n];
    }
}
