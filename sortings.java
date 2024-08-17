
import java.util.LinkedList;
import java.util.List;

public class sortings {

    public static int BubbleSort(int nums[]) {
        int swapped = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[nums.length - 1 - i];
                    nums[nums.length - 1 - i] = temp;
                    swapped++;

                }
                System.out.println(nums[j]);
            }

        }
        return swapped;
    }

    public static void insertionSort(int arr[]) {


        /*  {1,2,3,5,4} prev=i-1 arr[prev]>temp                    arr[prev+1]=temp
     i=1 temp =2    =0   &&      1>2          no insertion       =  0+1=index 1 par 2   1,2,3,5,4
     i=2 temp=3     =1   &&      3>3         no insertion        =  1+1= index 2 par 3  1,2,3,5,4 
     i=3 temp=5     =2   &&      3>5         no insertion        =  2+1=index 3 par 5  1,2,3,5,4
     i=4 temp=4     =3   &&      5>4  yes arr[prev+1]=arr[prev] = 4 index par 5 and prev-- p= 2  1,2,3, ,5
                    =2   &&      3>4  no insertion               = 2+1 =index 3 par 4  1,2,3,4,5
                    
                    ans ={1,2,3,4,5};
         */
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static List<Integer> finding(String[] nums, char x) {
        LinkedList<Integer> obj = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            String str = nums[i];
            for (int j = 0; j < str.length(); j++) {

                if (x == str.charAt(j)) {
                    obj.add(i);

                }

                if (obj.get(i) == obj.get(str.length() - 1 - i)) {
                    
                }
            }
        }

        return obj;

    }

    public static void main(String[] args) {
        String nums[] = {"leet", "code"};
        System.out.println(finding(nums, 'e'));
    }
}
