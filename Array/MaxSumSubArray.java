public class MaxSumSubArray {

    public static int maxSumSubArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int currSum = 0;   // reset here (IMPORTANT)

            for (int j = i; j < numbers.length; j++) {
                currSum += numbers[j];  // extend subarray
                System.out.println(currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, -6, 2, 3, -1};
        System.out.println("max sum = " + maxSumSubArray(numbers));
    }
}


// IN THIS CODE THE BRUTE FORCE METHOD IS USED