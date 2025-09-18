/* Och1r1
Problem Description:

Find Median From Data Stream
The median is the middle value in a sorted list of integers. 
For lists of even length, there is no middle value, 
so the median is the mean of the two middle values.
*/

import java.util.*;

public class MedianFinder {
    private PriorityQueue<Integer> leftSide;   // max heap
    private PriorityQueue<Integer> rightSide;  // min heap
    
    public MedianFinder() {
        leftSide = new PriorityQueue<>((a, b) -> b - a); // max-heap
        rightSide = new PriorityQueue<>(); // min-heap
    }
    
    public void addNum(int num) {
        // Step 1: always add to leftSide first
        leftSide.add(num);

        // Step 2: maintain order property (max of leftSide <= min of rightSide)
        if (!leftSide.isEmpty() && !rightSide.isEmpty() && leftSide.peek() > rightSide.peek()) {
            rightSide.add(leftSide.poll());
        }

        // Step 3: balance heaps (size difference <= 1)
        if (leftSide.size() > rightSide.size() + 1) {
            rightSide.add(leftSide.poll());
        } else if (rightSide.size() > leftSide.size() + 1) {
            leftSide.add(rightSide.poll());
        }
    }
    
    public double findMedian() {
        int totalSize = leftSide.size() + rightSide.size();
        
        if (totalSize % 2 == 0) {
            return (leftSide.peek() + rightSide.peek()) / 2.0;
        } else {
            // whichever side is bigger has the median
            return leftSide.size() > rightSide.size() ? leftSide.peek() : rightSide.peek();
        }
    }
}
