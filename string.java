
import java.util.Scanner;

public class string {

    public static char getOccCharacter(String s) {

        char countarr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int number = 0;
            // if (ch == 'a') {
            //     number = ch - 'a';
            // } else {
            //     number = ch - 'A';
            // }
            number = ch - 'a';
            countarr[number]++;
            s.charAt(i);
            Integer.toString(i);
        }
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (max < countarr[i]) {
                ans = i;
                max = countarr[i];
            }
        }
        char finalans = ((char) ('a' + ans));
        return finalans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getOccCharacter(str));
    }
}
