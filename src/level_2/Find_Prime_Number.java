package level_2;

/* 
 * k 진수에서 소수 개수 구하기
 * 기능 개발
 * https://programmers.co.kr/learn/courses/30/lessons/92335
 * 핵심 내용 : 수학
 *  */

public class Find_Prime_Number {
	public int solution(int n, int k) {
        String str=k!=10?changeNum(n,k):Integer.toString(n);
        
        int answer = 0;
        String[]nums=str.split("0+");
        for(int i=0;i<nums.length;i++){
            answer+=isPrime(Long.parseLong(nums[i]));
        }
        return answer;
    }
    
    private String changeNum(int n, int k){
        String str="";
        
        while(n>0){
            str+=Integer.toString(n%k);
            n/=k;
        }
        
        StringBuffer sb = new StringBuffer(str);
        str = sb.reverse().toString();
        
        return str;
    }
    
    private int isPrime(long x){
        if(x==1)
            return 0;
        
        if(x==2)
            return 1;
        
        for(int i=2;i<=(int)Math.sqrt(x);i++){
            if(x%i==0)
                return 0;
        }
        
        return 1;
    }
}
