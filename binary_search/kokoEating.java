public class kokoEating {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile : piles){
            if(pile > right){
                right = pile;
            }
        }

        while(left <= right){
            int middle = left + (right - left) / 2; // safer way to calculate middle
            long totalHours = 0;
            for(int pile : piles){
                totalHours += (pile + middle - 1) / middle; // integer ceiling division
            }

            if(totalHours <= h){ // can finish within h hours, try slower speed
                right = middle - 1;
            } else { // need faster speed
                left = middle + 1;
            }
        }

        return left; // left is the minimum speed that works
    }
}