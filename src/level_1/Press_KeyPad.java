package level_1;

/* 
 * 코딩 테스트 연습
 * 키패드 누르기 문제
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * 핵심 내용 : 2차원 배열과 배열간의 거리 계산 이용
 *  */

class Press_KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 배열 index의 키패드 위치
        int[][] numberPos={
            {3,1},  //0
            {0,0},  //1
            {0,1},  //2
            {0,2},  //3
            {1,0},  //4
            {1,1},  //5
            {1,2},  //6
            {2,0},  //7
            {2,1},  //8
            {2,2},  //9
        };
        
        // 왼손 : *, 오른손 : #
        int[]left={3,0};
        int[]right={3,2};
        
        for(int count=0;count<numbers.length;count++){
        	// 1,4,7이면 무조건 왼손
            if(numbers[count]==1||numbers[count]==4||numbers[count]==7){
                left=numberPos[numbers[count]];
                answer+="L";
            }
            // 3,6,9이면 무조건 오른손
            else if(numbers[count]==3||numbers[count]==6||numbers[count]==9){
                right=numberPos[numbers[count]];
                answer+="R";
            }
            // 2,5,8,0이면 어느 손을 할지 계산 후 선택
            else{
                int select=selectHand(left,right,numberPos[numbers[count]]);
                if(select==0){
                        left=numberPos[numbers[count]];
                        answer+="L";
                    }
                    else if(select==1){
                        right=numberPos[numbers[count]];
                        answer+="R";
                    }
                	// 거리가 같다면 hand인 손을 선택
                    else{
                        if(hand.equals("right")){
                            right=numberPos[numbers[count]];
                            answer+="R";
                        }
                        else{
                            left=numberPos[numbers[count]];
                            answer+="L";
                        }
                    }
            }
        }
        return answer;
    }
    
    public int selectHand(int[] left, int[] right, int[] number){
        int result;
        int leftDist=Math.abs(left[0]-number[0])+Math.abs(left[1]-number[1]);
        int rightDist=Math.abs(right[0]-number[0])+Math.abs(right[1]-number[1]);
        
        if(leftDist<rightDist)
            result=0;
        else if(leftDist>rightDist)
            result=1;
        else
            result=2;
        // 0:왼손, 1:오른손, 2:거리 같음(왼손or오른손)
        return result;
    }
}
