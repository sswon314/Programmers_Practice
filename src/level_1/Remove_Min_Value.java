package level_1;

/* 
 * 코딩 테스트 연습
 * 제일 작은 수 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 * 핵심 내용 : 배열
 *  */

public class Remove_Min_Value {
	public int[] solution(int[] arr) {
        int[] answer={-1};
        
        if(arr.length>1){
            int min=arr[0];
            int minIdx=0;
            
            for(int i=1;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                    minIdx=i;
                }
            }
            
            answer=new int[arr.length-1];
            int answerIdx=0;
            for(int i=0;i<arr.length;i++){
                if(i==minIdx)
                    continue;
                else{
                    answer[answerIdx++]=arr[i];
                }
            }
        }
        
        return answer;
    }
}
