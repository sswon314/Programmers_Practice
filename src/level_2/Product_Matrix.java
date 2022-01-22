package level_2;

/* 
 * 코딩 테스트 연습
 * 행렬의 곱
 * https://programmers.co.kr/learn/courses/30/lessons/12949
 * 핵심 내용 : 배열
 *  */

public class Product_Matrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][]answer=new int[arr1.length][arr2[0].length];
        
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer[i].length;j++){
                answer[i][j]=sumMatrix(arr1,arr2,i,j);
            }
        }
        return answer;
    }
    public int sumMatrix(int[][]arr1, int[][]arr2, int row, int col){
        int result=0;
        for(int i=0;i<arr1[row].length;i++){
            result+=arr1[row][i]*arr2[i][col];
        }
        
        return result;
    }
}
