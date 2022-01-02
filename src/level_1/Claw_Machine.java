package level_1;

/* 
 * 코딩 테스트 연습
 * 크레인 인형 뽑기 문제
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * 핵심 내용 : Stack 클래스 사용
 *  */

import java.util.*;

class Claw_Machine {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // 스택 클래스 선언
        Stack<Integer>stk=new Stack<>();
        
        // moves 길이 수만큼 반복하면서 차례대로 인형을 뽑음
        for(int m=0;m<moves.length;m++){
            int depth=0;
            int item=0;
            
            // 해당 위치에 인형이 있을때까지 깊이(depth)를 내림
            while(depth<board.length&&board[depth][moves[m]-1]==0)
                depth+=1;
            
            if(depth==board.length)
                continue;
            
            item=board[depth][moves[m]-1];
            board[depth][moves[m]-1]=0;
            
            if(stk.size()==0){
                stk.push(item);
                continue;
            }
            
            if(stk.peek()==item){
                stk.pop();
                answer+=2;
            }
            else{
                stk.push(item);
            }
        }
        
        return answer;
    }
}