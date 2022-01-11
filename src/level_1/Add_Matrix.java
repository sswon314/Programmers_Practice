package level_1;

/* 
 * 코딩 테스트 연습
 * 행렬의 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 * 핵심 내용 : 2차원 배열 연산
 *  */

public class Add_Matrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
