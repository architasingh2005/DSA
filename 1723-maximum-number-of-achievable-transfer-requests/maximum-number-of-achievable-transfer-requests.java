class Solution {
    int result = Integer.MIN_VALUE;
    int m;
    void solve(int index , int count , int[]resultant , int[][]requests, int n){
        if(index >= m){
            for(int i= 0; i<n; i++){
            if(resultant[i] != 0)
            return;



        }

        result = Math.max( result, count);
        return;
    }
      

        int from = requests[index][0];
        int to = requests[index][1];

        resultant[from]--;
        resultant[to]++;
        solve(index+1 , count+1, resultant , requests, n);

        resultant[from]++;
        resultant[to]--;
        solve(index+1, count , resultant , requests, n);
    }
    public int maximumRequests(int n, int[][] requests) {
        m = requests.length;
        int[] resultant = new int[n];
        solve(0,0, resultant, requests, n);
        return result;

        
    }
}