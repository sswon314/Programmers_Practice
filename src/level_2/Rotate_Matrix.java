package level_2;

/* 
 * 코딩 테스트 연습
 * 행렬 테두리 회전하기
 * https://programmers.co.kr/learn/courses/30/lessons/77485
 * 핵심 내용 : 배열
 *  */

public class Rotate_Matrix {
	public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][]matrix=new int[rows][columns];
        
        int matrixValue=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
                matrix[i][j]=matrixValue++;
        }
        
        for(int i=0;i<queries.length;i++){
            int startX=queries[i][0]-1,startY=queries[i][1]-1;
            int endX=queries[i][2]-1,endY=queries[i][3]-1;
            int minValue=matrix[startX][startY];
            answer[i]=minValue;
            
            // 왼쪽 테두리 위로 rotate
            for(int j=startX;j<endX;j++){
                answer[i]=Math.min(answer[i],matrix[j][startY]);
                matrix[j][startY]=matrix[j+1][startY];
            }
            // 아래 테두리 왼쪽으로 rotate
            for(int j=startY;j<endY;j++){
                answer[i]=Math.min(answer[i],matrix[endX][j]);
                matrix[endX][j]=matrix[endX][j+1];
            }
            // 오른쪽 테두리 아래로 rotate
            for(int j=endX;j>startX;j--){
                answer[i]=Math.min(answer[i],matrix[j][endY]);
                matrix[j][endY]=matrix[j-1][endY];
            }
            // 위 테두리 오른쪽으로 rotate
            for(int j=endY;j>startY;j--){
                answer[i]=Math.min(answer[i],matrix[startX][j]);
                matrix[startX][j]=matrix[startX][j-1];
            }
            matrix[startX][startY+1]=minValue;
            
        }
        return answer;
    }
}
