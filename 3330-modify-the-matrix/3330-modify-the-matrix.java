class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        int maxcol[]=new int[n];
        for(int j=0;j<n;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                if(matrix[i][j]!=-1){
                    max=Math.max(max,matrix[i][j]);
                }

            }
            maxcol[j]=max;
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=maxcol[j];
                    
                    
                }
            }
        }
        return matrix;
        
    }
}