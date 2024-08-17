
public class mergeSorts {

    public static void sort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        sort(arr, si, mid);//left
        sort(arr, mid + 1, ei);//right
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
// left
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        //right
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }

    public static void QuickShort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int pindex = partition(arr, si, ei);
        QuickShort(arr, si, pindex - 1);//left
        QuickShort(arr, pindex + 1, ei);//right
    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < arr.length; i++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.equals(str.equals(str));
        int arr[] = {6, 3, 9, 5, 2, 8};
        QuickShort(arr, 0, arr.length - 1);
        print(arr);
    }
}
/*
 System.out.print(" "+nums); public int[] sort(int[] nums, int si, int ei) {

        if (si >= ei) {
            return nums;
        }
        int pind = partition(nums, si, ei);
        sort(nums, si, pind);// left
        sort(nums, pind + 1, ei);// right
      return nums;
    }

    public int partition(int[] nums, int si, int ei) {
        int pviot = nums[ei];
        int i = si - 1;

        for (int j = si; j < nums.length; j++) {
            if (nums[j] < pviot) {
                i++;
                int temp = pviot;
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        i++;
        int temp = pviot;
        nums[ei] = nums[i];
        nums[i] = temp;
        return i;
    }
 */
