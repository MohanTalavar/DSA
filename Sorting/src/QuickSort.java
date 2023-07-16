import java.util.Arrays;

public class QuickSort {                           // PIVOT COMPARE SWAP 
    public static void main(String[] args) {

        int[] arr1 = {5, 4, 3, 2, 1};
        sort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

    } // end of main

    static void sort(int[] nums, int low, int high) {

        // terminating condition of recursion
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        while (s <= e) {

            // comparing left elems with pivot if less s++
            while (nums[s] < pivot) {
                s++;
            }

            // comparing right elems with the pivot if greater then e--
            while (nums[e] > pivot) {
                e--;
            }

            // if the above both conditions are violated them SWAP

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }

        } // end of outer while(s <= e)

        // now the pivot is at correct index , now sorting in two halves

        sort(nums, low, e);
        sort(nums, s, high);

    } // end of static sort()

}// end of class
