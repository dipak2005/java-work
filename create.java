
import java.util.ArrayList;

class Solution {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int target[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4};
        int index[] = {0, 1, 2, 2, 1};
        System.out.println(createTargetArray(arr, index));
    }
}
