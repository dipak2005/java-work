
public class Hello {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            for (int j = i; j >= 1; j--) {
                System.out.print(temp + " ");
                // if (i % 2 != 0) {
                // temp = temp + n - 1;
                // } else {
                temp = temp + n - 1;
                // }

            }
            System.out.println();

        }

    }
}
