
public class revision {

    public static int minAverage(int arr[], int size) {

        int minavg[] = new int[size];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int avg = 0;
        if (size < 0) {
            return avg;
        }
        for (int i = 0; i < size; i++) {

            if (arr[i] > max) {
                max = arr[i];

                // if (arr[i] == max) {
                //     continue;
                // }
            } else if (arr[i] < min) {
                min = arr[i];
                // if (arr[i] == min) {
                //     continue;
                // }
            } else {
                System.out.println("");
            }

        }

        avg = (max + min) / 2;
        int j = 0;
        minavg[j] = avg;
        j++;
        minAverage(arr, size);
        return avg;

    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 4, 15, 13, 4, 1};

        System.out.println(minAverage(arr, arr.length));

    }
}
