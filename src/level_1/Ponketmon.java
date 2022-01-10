package level_1;

/* 
 * 코딩 테스트 연습
 * 폰켓몬
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 * 핵심 내용 : 배열
 *  */

import java.util.*;

public class Ponketmon {
	public int solution(int[] nums) {
        int answer = nums.length/2;
        ArrayList<Integer> answer2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(answer2.contains(nums[i]))
                continue;
            else{
                answer2.add(nums[i]);
                if(answer2.size()>=answer)
                    break;
            }
        }
        
        return Math.min(answer,answer2.size());
    }
}
