package level_1;

/* 
 * 코딩 테스트 연습
 * K번째 수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * 핵심 내용 : 배열(ArrayList)
 *  */

import java.util.*;




class Number_Of_K {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int count=0;count<commands.length;count++){
            ArrayList<Integer> subArray=new ArrayList<Integer>();
            for(int i=commands[count][0]-1;i<commands[count][1];i++){
                subArray.add(array[i]);
            }
            Collections.sort(subArray);
            answer[count]=subArray.get(commands[count][2]-1);
            
            // +++copyOfRange메소드 사용으로 일정 범위의 배열값을 복사해올 수 있다+++
            // +++copyOfRange를 사용하면 ArrayList가 아닌 일반 배열로 출 수 있다
            // int[]subArray=Arrays.copyOfRange(array, commands[count][0]-1, commands[count][1]);
            // Arrays.sort(subArray);
            // answer[count]=subArray[commands[count][2]-1];
        }
        return answer;
    }
}