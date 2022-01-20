package level_1;

/* 
 * 코딩 테스트 연습
 * 서율에서 김서방 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 * 핵심 내용 : 배열
 *  */

public class Find_Kim {
	public String solution(String[] seoul) {
        int index=-1;
        
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                index=i;
                break;
            }
        }
        
        return "김서방은 "+index+"에 있다";
    }
}
