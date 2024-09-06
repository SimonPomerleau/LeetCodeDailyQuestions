public class Question2022{
    public static void main(String[] args) {
        int[] original = {3};
        int m = 1;
        int n = 2;
        int[][] tableua = construct2DArray(original,m,n);

    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        //var initialisation
        int[][] table2D = new int[m][n];
        int i = 0;
        int j = 0;
        int index = 0;
        //preventive check
        if(m*n!=original.length){
            return table2D = new int[0][0];
        }
        //conversion
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                table2D[i][j] = original[index];
                index++;
            }
        }
        return table2D;
    }

}

