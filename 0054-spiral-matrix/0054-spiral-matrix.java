class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=n-1;
        int right=m-1;
        int left=0;

        while(top<=bottom && right>=left){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
                
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
                
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
               
            }
             bottom--;
            }
            if(left<=right){
             for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
                
            }
            left++;
            }
        }
        return list;

        
    }
}