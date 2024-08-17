
import java.util.*;

public class Arr {

    public static void menu(String menulist[], String key, int i) {

        if (i == menulist.length) {
            return;
        }

        if (menulist[i] == key) {
            System.out.println(menulist[i]);
        }
        menu(menulist, key, i + 1);
    }

    public static int largest(int lar[]) {
        int largestnum = Integer.MIN_VALUE;

        for (int i = 0; i < lar.length; i++) {
            if (lar[i] > largestnum) {
                largestnum = lar[i];
            }
        }
        return largestnum;
    }

    public static int binarySearch(int lar[], int key) {
        int start = 0;
        int last = lar.length - 1;

        int mid = (start + last) / 2;

        while (start <= last) {
            if (key == mid) {
                return mid;
            } else if (key > mid) {
                start = mid + 1;
            } else {
                start = mid - 1;
            }
        }

        return -1;

    }

    public static void reverse(int numbers[], int first, int last) {
        // if (first == last) {
        //     System.out.println(numbers);
        // }

        // if (first < last) {
        //     int temp = numbers[first];
        //     numbers[first] = numbers[last];
        //     numbers[last] = temp;
        // }
        // reverse(numbers, first + 1, last - 1);
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
        System.err.println(numbers);
    }

    public static int subSquence(String str) {
        int tc = 0;
        for (int i = 0; i < str.length(); i++) {
            int start = i;
            for (int j = i; j < str.length(); j++) {
                int last = j;
                for (int k = start; k <= last; k++) {
                    System.out.print(k);
                    tc++;
                }

                System.out.println();
            }
            System.out.println();

        }
        return tc;
    }

    public static void subArrSum(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int last = j;
                for (int k = start; k <= last;
                        k++) {
                    System.out.print(" " + numbers[k] + "");

                    // while (numbers[k] != 0) {
                    //     int remainder = numbers[k] % 10;
                    //     sum = sum + remainder;
                    //     // numbers[k] = numbers[k] / 10;
                    // }
                    // System.out.print(sum);
                    // // System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void leet(int nums[]) {
        int tc = 0;
        int sum = 0;
        int maxvalue = Integer.MIN_VALUE;
        int minvalue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            int start = i;

            for (int j = i; j < nums.length; j++) {

                int last = j;

                for (int k = start; k <= last; k++) {

                    System.out.print(" " + nums[k] + " ");
                    sum += nums[k];

                }

                tc++;

                System.out.println();

            }

            System.out.println("sum is :" + sum);

            System.out.println();

        }

        if (minvalue > sum) {
            minvalue = sum;
            System.out.println(minvalue);
        }
        if (maxvalue < sum) {
            maxvalue = sum;
            System.out.println("the max sum of all :" + maxvalue + " ");
        }

        System.out.print("total count " + tc);
    }

    public static void prefixSum(int nums[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int last = j;

                currentsum = start == 0 ? prefix[last] : prefix[last] - prefix[start - 1];
            }

        }
        if (maxsum < currentsum) {
            maxsum = currentsum;
        }
        System.out.println(" max sum :" + maxsum);
    }

    public static void kadanz(int nums[]) {
        int currentsum = 0;

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentsum = currentsum + nums[i];
            // Math.m
            if (currentsum < 0) {
                currentsum = 0;
            }
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println("max sum: " + maxsum);
    }

    public static boolean containsDuplicate(int[] nums, int i) {
        boolean isTwice = false;
        if (i == nums.length - 1) {
            return isTwice;
        }

        if (nums[i] == nums[i + 1]) {
            isTwice = true;
        }
        containsDuplicate(nums, i + 1);
        return isTwice;
    }

    public static int removeDuplicates(int[] nums) {
        int unique = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = 0;
                } else {
                    unique++;
                }
            }

        }
        return unique;
    }

    public static int trap(int[] height) {

        int leftmax[] = new int[height.length];

        /*
         leftmax array ni size main array na size jetli j chhe
         main arry: { 8,4,2,0,4,6,4,2,0}
         start from left[0]=height[0];

         compare  (8,8)-> 8
         c (8,4) -> 8
         c (4,2)-> 4
         c (2,0)-> 2
         c (0,4)-> 4
         c (4,6)-> 6
         c (4,2)-> 4
         c (2,0)-> 2
          we stored in left max ={8,8,4,2,4,6,4,2};
          
         
         */
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        /*
          for right max
            main arry: { 8,4,2,0,4,6,4,2,0}
          start from right[height.length-1]=hight[height.length-1];

          this treverse backword
          c (0,0)-> 0
          c (0,2)-> 2
          c (2,4)-> 4
          c (4,6)->6
          c (6,4)-> 6
          c (4,0)-> 4
          c (0,2)-> 2
          c (2,4)-> 4
          c (4,8)-> 8
         
          we stroed in right max ={0,2,4,6,6,4,2,4,8}
          
         */
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }


        /*
          we considered only min value of left max array and right max array of boundries
          and we considred as water level 
          we calculate the rain water =rainwater +waterlevel -main array [i]
          and return rainwater
         */
        int trapwater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - height[i];
        }
        return trapwater;
    }

    public static int byandSellStock(int price[]) {
        // our bystock will be  very high like +infinity 
        int bystock = Integer.MAX_VALUE;
        int max_profite = 0;

        for (int i = 0; i < price.length; i++) {
            /*
             so our bystock in less then our shell stock price 
             so we get the profiet which shellstock-byftock=profit
             and we calculate the max profite in current profit and max_profit
             */
            if (bystock < price[i]) {
                int profit = price[i] - bystock;
                max_profite = Math.max(profit, max_profite);
            } else {
                /*
                 else our shellstock is less then bystock 
                 so we by the stock for future for better selling opportunity
                 and return the max profit
                 */
                bystock = price[i];
            }
        }
        return max_profite;
    }

    public static int duplicate(int nums[]) {

        int j = 1;
        /*  {1,2,3,4,5,6,1};
      j=1;  nums[i]! nums[i-1]        nums[j]=nums[i]
      i=1   2!=1 = yes    store the val: 2 at pos=nums[j]=  1  [2,];  j++; j=2
      i=2   3!=2 =yes     store the val: 3 at pos=nums[j]=  2  [2,3]  j++; j=3
      i=3   4!=3 =yes     store the vale :4 at pos =nums[j]=3  [2,3,4] j++; j=4
      i=4    5!=4 =yes    store the val: 5 at pos =nums[j]=4   [2,3,4,5] j++; j=5
      i=5    6!=5 =yes    store the val: 6 at pos =nums[j]=5   [2,3,4,5,6] j++ ; j=6
      i=6    1!=6 =yes    store the val :1 at pos =nums[j]=6    [2,3,4,5,6,1] 
         */
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            System.out.println(nums[i]);
        }

        System.out.println("lengths : " + j);
        return j;
    }

    public static int[] plusOne(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            int element = digits[i];
            sum = sum * 10 + element;

        }

        sum++;
        int i = 0;
        while (sum != 0) {
            int last = sum % 10;
            digits[i] = last;
            i++;
            sum /= 10;
        }

        return digits;
    }

    public static int words(String[] sentences) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < sentences.length; i++) {
            String word = sentences[i];
            int count = 1;
            // if ((word.charAt(i)==word.valueOf(""))) {
            //     count++;
            // }
            largest = Math.max(largest, count);
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> obj = new LinkedList<>();

        String str = "dipak";

        int lar[] = {10, 4, 8, 3};
        // int num = 123;
        // int 
        // System.out.println(lar.length + 1);
        // String sentece[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        prefixSum(lar);

        int ans[] = new int[lar.length];
        int lsum = 0;
        for (int i = 0; i < lar.length; i++) {

            if (lar[i - 1] == -1) {
                lsum = 0;
            } else {
                lsum += lar[i - 1];
            }

            ans[i] = lsum;
            System.out.println(ans[i]);
        }

    }

}
