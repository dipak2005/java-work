
public class Main {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // int n = 6;
        // Scanner dipak = new Scanner(System.in);
        // int arr[] = new int[n];
        // System.out.println("Enter inputs......!");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = dipak.nextInt();
        // }
        // bubbleSort(arr);
        // System.out.println("Dsecending Order");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // System.out.println("Acending Order");
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }
        int arr[] = {1, 2, 3, 4, 5};

    }
}
