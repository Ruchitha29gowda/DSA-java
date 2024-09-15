import java.util.Arrays;

public class ClimbingStairs{
    public static int recursion(int n){
        if(n==0 || n==1) return 1;
        return recursion(n-1)+ recursion(n-2);
    }

    public static int memoisation(int n, int[] stairs){
        if(n==0 || n==1) return 1;
        if(n<0) return 0;
        if(stairs[n]!=-1) return stairs[n];

        stairs[n] = memoisation(n-1, stairs)+ memoisation(n-2, stairs);
        return stairs[n];
    }

    public static void tabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        System.out.println("hello");

        //we can only 1 step at a time or 2 steps at a time
        //find how many ways are there to reach nth stair step
        int n=5;

        //-----RECURSION-----
        System.out.println(recursion(n));

        //-----MEMOISATION-----
        int stairs[] = new int[n+1];
        Arrays.fill(stairs, -1);
        System.out.println(memoisation(n, stairs));

        //-----TABULATION-----
        tabulation(n);
    }
}