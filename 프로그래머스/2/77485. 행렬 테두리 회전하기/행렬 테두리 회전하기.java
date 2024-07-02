import java.util.*;

class Solution {
    int[][] matrix;
    int exNum;
    Stack<Integer> arr;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        
        matrix = new int[rows][columns];
        int k = 0;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                k++;
                matrix[i][j] = k;
            }    
        }
        
        for(int[] query: queries) {
            arr = new Stack<Integer>();
            int startRows = query[0] - 1;
            int startColumns = query[1] - 1;
            int endRows = query[2] - 1;
            int endColumns = query[3] - 1;
           
            exNum = matrix[startRows][startColumns];
            rotation(startColumns, startRows, endColumns, endRows);
            int min = findResult();
            answer[idx] = min;
            idx++;
        }
        return answer;
    }
    
    private void rotation(int startColumns, int startRows, 
                          int endColumns, int endRows) {
        //1차: columns start~end (startRows prefix)
        for(int i = startColumns + 1; i <= endColumns; i++) {
            arr.add(exNum);
            int current = matrix[startRows][i];
            matrix[startRows][i] = exNum;
            exNum = current;
         }
        
        
        //2차: rows start~end (endColumns prefix)
        for(int i = startRows + 1; i <= endRows; i++) {
            arr.add(exNum);
            int current = matrix[i][endColumns];
            matrix[i][endColumns] = exNum;
            exNum = current;
         }
        
        //3차: columns만 end~start (endRows prefix)
        for(int i = endColumns - 1; i >= startColumns; i--) {
            arr.add(exNum);
            int current = matrix[endRows][i];
            matrix[endRows][i] = exNum;
            exNum = current;
        }
        //4차: rows만 end~start (startColumns prefix)
        for(int i = endRows - 1; i >= startRows; i--) {
            arr.add(exNum);
            int current = matrix[i][startColumns];
            matrix[i][startColumns] = exNum;
            exNum = current;
        }        
    }
    

    private int findResult(){
        int min = Math.min(arr.peek(), 10000);
        while(arr.size() > 0) {
            min = Math.min(min, arr.pop());
        }
        return min;
    }
}