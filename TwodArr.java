
import java.util.*;

public class TwodArr {

    public static void largest(int nums[][]) {
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (largest < nums[i][j]) {
                    largest = nums[i][j];
                }
                if (small > nums[i][j]) {
                    small = nums[i][j];
                }

            }

        }
        System.out.println(" largest " + largest + " smallest " + small);

    }

    public static void spiralMatrix(int nums[][]) {

        // for row of matrix
        int startRow = 0;
        int endRow = nums.length - 1;   //(n-1)

        // for column of matrix
        int startCol = 0;
        int endCol = nums[0].length - 1;//(n-1)

        /*        1st iteration (outer loop or spiral) | 2nd iteration (inner loop or spiral) | output 
                                        startrow= 0    |     1  0+1=1 ++                      | 1 2 3 4     --> --> 
                                        endrow= 3      |     2  3-2=1 --                      | 5 6 7 8     |     | 
                                        startcol= 0    |     1  0+1=1 ++                      | 9 10 11 12  |     |
                                        endcol= 3      |     2  3-2=1 --                      | 13 14 15 16 <-- <--
         */
        while (startRow <= endRow && startCol <= endCol) {

            //print the top boundries variable=(column)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(nums[startRow][j]);
            }

            // print the right boundries variable=(row)
            for (int i = startRow + 1; i <= endRow; i++) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(nums[i][endCol]);
            }

            // print the bottom boundries variable=(column)
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(nums[endRow][j]);
            }

            // print the left boundries varible=(row)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(nums[i][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> obj = new LinkedList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            //top boundry
            for (int j = startCol; j <= endCol; j++) {
                obj.add(matrix[startRow][j]);
            }

            // right boundry
            for (int i = startRow + 1; i <= endRow; i++) {
                obj.add(matrix[i][endCol]);

            }

            // bottom boundry
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                obj.add(matrix[endRow][j]);

            }

            // left boundry
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                obj.add(matrix[i][startCol]);

            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return obj;
    }

    public static int diagonalSum(int nums[][]) {

        int diasum = 0;
        for (int i = 0; i < nums.length; i++) {

            // for (int j = 0; j <= nums[0].length; j++) {
            //     if (i == j) {
            //         diasum += nums[i][j];
            //     } else if (i + j == nums.length - 1) {
            //         diasum += nums[i][j];
            //     }
            // }
            diasum += nums[i][i];

            if (i != nums.length - 1 - i) {
                diasum += nums[i][nums.length - 1 - i];
            }
        }

        return diasum;

    }

    public static void stairCaseSearch(int nums[][], int key) {

        int row = 0;
        int col = nums[0].length - 1;

        while (row < nums.length && col >= 0) {
            if (nums[row][col] == key) {
                System.out.print("found " + row + "," + col + "");

            } else if (key < nums[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");

    }

    public static void sorted(int num1[], int num2[]) {
        LinkedList<Integer> obj = new LinkedList<>();

        for (int i = 0; i < num1.length; i++) {
            obj.add(num1[i]);
            obj.add(num2[i]);
        }
        System.out.println(obj);
    }

    public static void main(String[] args) {
        int num1[] = new int[2];
        int num2[] = new int[2];
        LinkedList<Integer> obj = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num1.length; i++) {

            num1[i] = sc.nextInt();
            obj.add(num1[i]);

        }
        for (int i = 0; i < num1.length; i++) {

            num2[i] = sc.nextInt();
            obj.add(num2[i]);

        }
        sorted(num1, num2);
        // obj.element() // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[0].length; j++) {
        //         System.err.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // int key = 33;
        // // stairCaseSearch(nums, key);
        // System.out.println(obj);
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[0].length; j++) {
        //         nums[i][j] = sc.nextInt();
        //         obj.add(nums[i][j]);

        //     }
        // }
        // obj.add(2, 10);
        // System.out.println(obj.size());
        // System.out.println(obj);
    }
}
