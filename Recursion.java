
public class Recursion {

    public static void printAssendingNum(int n) {
        if (n == 0) {
            return;

        } else {
            System.out.println(n);
        }

        printAssendingNum(n - 1);

    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        printInc(n - 1);
        System.out.println(n + "");
    }

    public static int factorial(int n) {
        if (n == 0) {

            return 1;
        }

        int fact = factorial(n - 1) * n;
        return fact;

    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        sum(n - 1);
        int sun = n + sum(n - 1);
        return sun;
    }

    public static int fibo(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fibo(n - 1);
        int f2 = fibo(n - 2);
        return f1 + f2;
    }

    public static boolean sorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sorted(arr, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int found = lastOccurence(arr, key, i + 1);
        if (found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizepow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpow = optimizepow(x, n / 2);
        int square = halfpow * halfpow;

        if (n % 2 != 0) {
            square = x * square;
        }
        return square;
    }

    public static int tillingProblem(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int vertical = tillingProblem(n - 1);
        int horizontal = tillingProblem(n - 2);
        return vertical + horizontal;
    }

    public static void remove(String str, int idx, StringBuilder newstr, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        int current = str.charAt(idx);
        if (map[current - 'a'] == true) {
            remove(str, idx + 1, newstr, map);
        } else {
            map[current - 'a'] = true;
            remove(str, idx + 1, newstr.append(current), map);
            int value = Integer.MAX_VALUE;
        }

    }

    public static int reverse(int n) {
        int reversenum = 0;

        while (n != 0) {
            reversenum = reversenum * 10 + n % 10;
            n /= 10;
            if (reversenum > Integer.MAX_VALUE || reversenum < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return reversenum;
    }

    public static void printB(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i % 2 != 0) {
                    if (i + j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" * ");
                    }
                } else {
                    if (i + j % 2 != 0) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void binaryStr(int lastPlace, String str, int idx) {

        if (idx == 0) {
            System.out.println(str);
            return;
        }
        binaryStr(0, str + "0", idx - 1);

        if (lastPlace == 0) {
            binaryStr(1, str + "1", idx - 1);
        }
    }

    public static boolean isPalindrome(int x) {
        int palindrome = 0;
      int original=x;
        while (x != 0) {

            palindrome = palindrome * 10 + x % 10;
            x /= 10;

        }

        return palindrome == original;
    }


    class Solution {
        public static boolean isPalindrome(int x) {
        
         int original = x;
         int palindrome = 0;
          
       if(x < 0){
         return false;
       }
     
         while (x != 0) {
             palindrome = palindrome * 10 + x % 10;
             x /= 10;
         }
     
         
         return palindrome == original;
     }
     
     };

    public static void main(String[] args) {
        /*
 steps for recursion
 1 base case known
 2 kuch kam hoga depend upon you
 3 inner function ko call lagana

         */

        // int n = 5;
        // System.out.print(fibo(n));
        int arr[] = {1, 3, 4, 2, 5};
        // System.out.print(tillingProblem(4));
        String str = "dipakkumar";
        // remove(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.print(isPalindrome(10));

    }
}
