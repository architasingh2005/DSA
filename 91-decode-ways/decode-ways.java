import java.util.Arrays;

class Solution {
    static int[] dp;
    static int n;

    int solve(int i, String s) {
        if (i == s.length()) 
        return 1;  
        if (s.charAt(i) == '0') 
        return 0; 

        if (dp[i] != -1) 
        return dp[i];

        
        int onechar = solve(i + 1, s);

        
        int twochar = 0;
        if (i + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) {
                twochar = solve(i + 2, s);
            }
        }

        dp[i] = onechar + twochar;
        return dp[i];
    }

    public int numDecodings(String s) {
        n = s.length();
        dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, s);
    }
}

