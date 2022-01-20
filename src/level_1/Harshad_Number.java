package level_1;

/* 
 * 코딩 테스트 연습
 * 하샤드 수
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 * 핵심 내용 : 수학
 *  */

public class Harshad_Number {
	public boolean solution(int x) {
        int allSum=sum(x,10000);
        
        if(x%allSum==0)
            return true;
        else
            return false;
    }
    
    public int sum(int num,int y){
        if(y==1)
            return num;
        else
            return (num/y)+sum(num%y,y/10);
    }
}
