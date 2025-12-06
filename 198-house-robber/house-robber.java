/*class Solution {
    // top down approach 
    int[]dp ;
    int solve(int[]nums, int i){
        if(i>= nums.length)
        return 0;

        if (dp[i] != -1) 
        return dp[i];

        int take = nums[i] + solve(nums, i + 2); 
        int skip = solve(nums, i + 1);           

        dp[i] = Math.max(take, skip);
        return dp[i];
    }



    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(nums, 0);

        
    }
}*/
// bottom up 

/*class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) 
        return 0;
        if (n == 1) 
        return nums[0];

        int[] dp = new int[n];

      
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

       
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        
        return dp[n - 1];
    }
}*/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int p2= nums[0];
        int p1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int curr = Math.max(p1, nums[i] + p2);
            p2 = p1;
            p1 = curr;
        }

        return p1;
    }
}