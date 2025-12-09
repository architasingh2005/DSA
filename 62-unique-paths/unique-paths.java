// class Solution {
//     static int[][] dp;

    

//     // int solve( int i , int j){
//     //     if(i<0 || j<0)
//     //     return  0;
//     //     if(i==0 && i==0)
//     //     return 1;
       

//     //     if(dp[i][j] != -1){
//     //         return dp[i][j];
//     //     }

//     //     int up = solve(i-1 ,j);
//     //     int left = solve(i , j-1);

//     //     return dp[i][j] = up + left;
        

//     // }
//     private static int solve( int i , int j){
//     for(int i = 0; i<= m ; i++){
//         for(int j = 0; j<= n ; j++){
//             if(i==0 && j==0){
//                 dp[0][0] = 1;
//             }
//             else{
//             int up = 0 ; 
//             int left = 0;
//             if(i>0)
//             up = dp[i-1][j];
//             if(j>0)
//             left = dp[i][j-1];

//             dp[i][j] = up +left;


//         }
//         return dp[i][j];
//     }
//   }
// }


//     public int uniquePaths(int m, int n) {

//         dp = new int[m][n];
//         for(int [] row: dp)
//         Arrays.fill(row , -1);
//         return solve( m-1 , n-1);
        

        
        
//     }
// }


class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

    
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

       
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}




