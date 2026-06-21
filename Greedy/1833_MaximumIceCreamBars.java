import java.util.*;
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        Arrays.sort(costs);
        int count = 0;
        for(int cost : costs){
            if(coins >= cost){
                coins -= cost;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}