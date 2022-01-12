package level_1;

/* 
 * 코딩 테스트 연습
 * 최대 공약수와 최소 공배수
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 * 핵심 내용 : 최대공약수(유클리드 호제법), 최소공배수(두 수의 곱 / 최대공약수) 알고리즘
 *  */

public class GCD_LCM {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n<m){
            int temp=n;
            n=m;
            m=temp;
        }
        answer[0]=gcd(n,m);
        answer[1]=n*m/answer[0];
        
        return answer;
    }
    
    public int gcd(int n, int m){
        if(m==0)
            return n;
        else
            return gcd(m,n%m);
    }
}
