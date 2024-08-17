
import java.util.*;

public class bst {

    public static int leftoccurence(int arr[], int key) {

        int start = 0;
        int last = arr.length - 1;
        int mid = start + (last - start) / 2;
        int ans = 0;
        while (start <= last) {

            if (arr[mid] == key) {
                ans = mid;
                last = mid - 1;
            } else if (key < arr[mid]) {
                last = mid - 1;
            } else {
                start = mid + 1;

            }
            mid = start + (last - start) / 2;
        }
        return ans;
    }

    public static double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        double minAvg = Double.MAX_VALUE;

        while (i < j) {
            double avg = (double) (nums[i] + nums[j]) / 2;

            if (avg < minAvg) {
                minAvg = avg;
            }
            i++;
            j--;
        }

        if (i == j) {
            minAvg = Math.min(minAvg, nums[i]);
        }
        return minAvg;

    }

    public static int rightoccurence(int arr[], int key) {

        int start = 0;
        int last = arr.length - 1;
        int mid = start + (last - start) / 2;
        int ans = 0;
        while (start <= last) {

            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                last = mid - 1;
            } else {
                start = mid + 1;

            }
            mid = start + (last - start) / 2;
        }
        return ans;
    }

    public static int squareroot(int n) {

        int si = 0;
        int ei = n;
        int mid = si + (ei - si) / 2;
        long ans = 1;
        while (si <= ei) {

            long sqt = mid * mid;

            if (sqt == n) {
                return mid;
            }

            if (sqt > n) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
            mid = si + (ei - si) / 2;
        }
        return -1;
    }

    public static double moreprecision(int n, int pricision, int solution) {

        double factor = 1;
        double ans = solution;
        for (int i = 0; i < pricision; i++) {
            factor = factor / 10;

            for (double j = ans; j * j < n; j = j + factor) {
                ans = j;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[], int stulimit, int mid) {

        int studentCount = 1;
        int pagesum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pagesum + arr[i] <= mid) {
                pagesum = pagesum + arr[i];
            } else {
                studentCount++;
                if (studentCount > stulimit || arr[i] > mid) {
                    return false;
                }
                pagesum = arr[i];
                // pagesum = pagesum + arr[i];
            }
        }
        return true;
    }

    public static int BookAllocation(int arr[]) {

        int si = 0;

        int sum = 0;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int ei = sum;

        int mid = si + (ei - si) / 2;

        while (si <= ei) {

            if (isPossible(arr, 2, mid)) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
            mid = si + (ei - si) / 2;
        }
        return ans;
    }

    public static int partision(int arr[]) {

        int si = 0;
        int sum = 0;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int ei = sum;
        int mid = si + (ei - si) / 2;
        while (si <= ei) {

            if (isPossible(arr, 2, mid)) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
            mid = si + (ei - si) / 2;
        }

        return ans;
    }

    public static boolean iscow(int arr[], int maxcow, int mid) {

        int cowCount = 1;
        int lastpos = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - lastpos >= mid) {
                cowCount++;
                if (cowCount == maxcow) {
                    return true;
                }
                lastpos = arr[i];
            }
        }
        return false;
    }

    public static int AggresiveCows(int arr[]) {

        int si = 0;
        int max = Integer.MIN_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];

            }
        }
        int ei = max;
        int ans = Integer.MIN_VALUE;
        int mid = si + (ei - si) / 2;
        while (si <= ei) {

            if (iscow(arr, 2, mid)) {
                ans = mid;
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
            mid = si + (ei - si) / 2;

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sd = new Scanner(System.in);
        // int n = sd.nextInt();
        int arr[] = {4, 2, 1, 3, 6};
        // System.out.println(leftoccurence(arr, 3));
        // System.out.println(rightoccurence(arr, 3));
        // System.out.println(minimumAverage(arr));
        // int solution = squareroot(n);
        // System.out.println(moreprecision(n, 3, solution));
        System.out.println(AggresiveCows(arr));
    }
}
