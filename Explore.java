
public class Explore {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};
        int p = 6;

        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int targetRemainder = totalSum % p;

        // If the total sum is already divisible by p, no subarray needs to be removed
        if (targetRemainder == 0) {
            System.out.println(0);
            return;
        }

        int minLength = nums.length;

        // Sliding window approach
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;

            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];

                // Calculate the remainder after removing the current subarray
                int remainingSum = totalSum - currSum;
                if (remainingSum % p == 0) {
                    minLength = Math.min(minLength, j - i + 1);
                }
            }
        }

        // If we found a valid subarray, print its length; otherwise, print -1
        if (minLength == nums.length) {
            System.out.println(-1);
        } else {
            System.out.println(minLength);
        }
    }
}
