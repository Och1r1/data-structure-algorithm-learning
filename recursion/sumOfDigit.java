public class sumOfDigit {
    public static int holder = 0;
    public static int sum(int digit){
        System.out.println("=== Entering sum() with digit: " + digit + " ===");
        System.out.println("Current holder value: " + holder);
        
        if(digit < 10){
            System.out.println("BASE CASE: digit (" + digit + ") is less than 10");
            System.out.println("Adding final digit " + digit + " to holder");
            holder += digit;
            System.out.println("Final holder value: " + holder);
            System.out.println("Returning from base case with value: " + holder);
            return holder;
        }
        else{
            int lastDigit = digit % 10;
            System.out.println("Extracting last digit: " + digit + " % 10 = " + lastDigit);
            holder += lastDigit;
            System.out.println("Added " + lastDigit + " to holder, new holder: " + holder);
            
            digit = digit / 10;
            System.out.println("Removing last digit: remaining number = " + digit);
        }
        
        System.out.println("Making recursive call with digit: " + digit);
        System.out.println("--- End of current call, going deeper ---");
        return sum(digit);
    }

    public static void main(String[] args) {
        System.out.println("Starting program to find sum of digits in 1333");
        System.out.println("Initial holder value: " + holder);
        System.out.println("\n*** CALLING sum(1333) ***\n");
        
        int result = sum(1333);
        
        System.out.println("\n*** RECURSION COMPLETE ***");
        System.out.println("Function returned: " + result);
        System.out.println("Final holder value: " + holder);
        System.out.println("Sum of digits in 1333 = " + holder);
    }
}

