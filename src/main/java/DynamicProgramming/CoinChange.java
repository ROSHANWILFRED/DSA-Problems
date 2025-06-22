package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {

    static int minimumCoinCount(int[] coins, int amount) {
        if (amount<1) return 0;
        int[] minCoinDP = new int[amount+1];
        for (int i = 1;i<=amount;i++) {
            minCoinDP[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin<=i && minCoinDP[i-coin] != Integer.MAX_VALUE) {
                    minCoinDP[i] = Math.min(minCoinDP[i],1+minCoinDP[i-coin]);
                }
            }
        }
        System.out.println(Arrays.toString(minCoinDP));
        return minCoinDP[amount] == Integer.MAX_VALUE ? -1 : minCoinDP[amount];
    }

    static int numberOfCombinations(int[] coins, int amount) {
        int[] waysDP = new int[amount+1];
        waysDP[0] = 1;
        for (int coin : coins) {
            for (int i = coin;i<=amount;i++) {
                waysDP[i] = waysDP[i] + waysDP[i-coin];
            }
        }
        System.out.println(Arrays.toString(waysDP));
        return waysDP[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,5,6,9};
        int amount = 11;
        System.out.println(minimumCoinCount(coins,amount));
        System.out.println(numberOfCombinations(coins,amount));
    }
}
