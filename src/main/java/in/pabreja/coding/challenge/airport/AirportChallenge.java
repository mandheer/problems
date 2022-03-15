package in.pabreja.coding.challenge.airport;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AirportChallenge {

    public static long walkWayLen;
    public static int slugSpeed;
    public static int coffeeSpeed;
    public static long coffeeCooldownTime;
    public static long coffeeDrinkDuration;
    public static long c;
    public static int coffeeCartsCount;
    public static long[] carts;

    public static void main(String[] args) throws Exception {

        // Read in all the basic parameters.
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(stdin.readLine());
        walkWayLen = Long.parseLong(tok.nextToken());
        slugSpeed = Integer.parseInt(tok.nextToken());
        coffeeSpeed = Integer.parseInt(tok.nextToken());
        coffeeCooldownTime = Long.parseLong(tok.nextToken());
        coffeeDrinkDuration = Long.parseLong(tok.nextToken());

        // Adjusting length so we can avoid doubles for time. time in units 1/(v1*v2) sec.
        c = slugSpeed * coffeeSpeed;
        walkWayLen *= c;

        // Get cart locations - adjust by factor v1*v2.
        coffeeCartsCount = Integer.parseInt(stdin.readLine().trim());
        tok = new StringTokenizer(stdin.readLine());
        carts = new long[coffeeCartsCount +1];
        for (int i = 0; i< coffeeCartsCount; i++)
            carts[i] = slugSpeed * coffeeSpeed * Long.parseLong(tok.nextToken());
        carts[coffeeCartsCount] = walkWayLen;

        // Set up DP.
        long[] dp = new long[coffeeCartsCount +1];
        Arrays.fill(dp, -1);
        dp[coffeeCartsCount] = 0;
        int[] next = new int[coffeeCartsCount +1];
        Arrays.fill(next, -1);

        int j = coffeeCartsCount; // j is index we are building off of.

        // Fill in DP array backwards.
        for (int i = coffeeCartsCount -1; i>=0; i--) {

            // Where we would run out of coffee if we took coffee from this cart.
            long marker = carts[i] + c*(slugSpeed * coffeeCooldownTime + coffeeSpeed * coffeeDrinkDuration);

            // Means this is our last coffee since it lasts till the end - just calculate straight.
            if (marker > walkWayLen) {
                dp[i] = cost(i, coffeeCartsCount);
                continue;
            }

            // Iterate j back to our breaking point.
            while (j > i && carts[j] > marker) j--;
            if (i == j) j++;

            // Cost (i,j) is the time to get from i to j just taking coffee at i.
            dp[i] = cost(i,j) + dp[j];
            next[i] = j;

            // Try the first shop after our marker.
            if (j+1 <= coffeeCartsCount && cost(i,j+1) + dp[j+1] < dp[i]) {
                dp[i] = cost(i,j+1) + dp[j+1];
                next[i] = j+1;
            }
        }

        // Just build our list forward.
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (coffeeCartsCount > 0) {
            res.add(0);
            j = 0;
            while (next[j] != -1 && next[j] != coffeeCartsCount) {
                res.add(next[j]);
                j = next[j];
            }
        }

        // Output the result.
        System.out.println(res.size());
        StringBuffer sb = new StringBuffer();
        if (coffeeCartsCount > 0) sb.append(res.get(0));
        for (int i=1; i<res.size(); i++)
            sb.append(" "+res.get(i));
        System.out.println(sb);

    }

    // Returns the time for going from stop i to j only taking coffee at i.
    public static long cost(int i, int j) {

        long d = carts[j] - carts[i];
        long full = c*(slugSpeed * coffeeCooldownTime + coffeeSpeed * coffeeDrinkDuration);

        // Easy case, coffee is done.
        if (d >= full)
            return coffeeCooldownTime *c + coffeeDrinkDuration *c + (d - full)/ slugSpeed;

        // We get to start drinking it...
        if (d >= c* slugSpeed * coffeeCooldownTime)
            return coffeeCooldownTime *c + (d-c* slugSpeed * coffeeCooldownTime)/ coffeeSpeed;

        // Never drink it (pretty dumb) but I think I need this.
        return d/ slugSpeed;
    }
}