
public class practice {

    public static void mergeShort(int nums[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        /*
          si+ (ei-si)/2
          si-si/2+ei/2;
          si/2+ei/2;
         */
        int mid = si + (ei - si) / 2;
        mergeShort(nums, si, mid);//0 to m=4  value: 4 to 8
        mergeShort(nums, mid + 1, ei); // mid +1= 4+1 =5  ei=8 value 9 to 5
        merge(si, mid, ei, nums);
        return;
    }

    public static void merge(int si, int mid, int ei, int nums[]) {

        int temp[] = new int[nums.length];

        int i = si;//left
        int j = mid + 1;//right
        int k = 0;

        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            k++;
            i++;
        }

        while (j <= ei) {
            temp[k] = nums[j];
            k++;
            j++;
        }

        for (k = 0, i = 0; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
        return;
    }

    public static void main(String[] args) {

        int arr[] = {4, 3, 2, 7, 8, 9, 0, 1, 5};
        mergeShort(arr, 0, arr.length - 1);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
