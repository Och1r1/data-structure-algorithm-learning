public class bestTime{
    public static int maxProfit(int[] prices) {
        int right = 1;
        int min = prices[0];
        int max = prices[right];

        int bestTime = 0;

        while(right < prices.length){
            if(prices[right] < min){
                min = prices[right];
                max = prices[right];
            }else if(max < prices[right]){
                max = prices[right];
            }

            right++;
            int diff = max - min;
            if(diff > bestTime){
                bestTime = diff;
            }
        }
         
        return bestTime;
    }

    public static void main(String[] args){
        int[] prices = {10,8,7,5,2};

        System.out.println(maxProfit(prices));
    }

}