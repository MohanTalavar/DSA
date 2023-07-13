import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr1 = {5, 4, 3, 2, 1 , 99};
        int[] arr2 = {100, 90, 80, 70, 50};

        sort(arr1,0,arr1.length-1);
        sortByMe(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    } // end of main

    static void sort(int[] nums, int low , int high){

        // terminating condition of recursion
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s)/2;
        int pivot = nums[mid];

        while(s <= e){

            // comparing left elems with pivot if less s++
            while(nums[s]< pivot){
                s++;
            }

            // comparing right elems with the pivod if greater then e--
            while(nums[e]>pivot){
                e--;
            }

            // if the above both conditions are voilated them SWAP

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }

        } // end of outer while(s <= e)

        // now the pivot is at correct index , now sorting in two halves

        sort(nums,low,e);
        sort(nums,s,high);

    } // end of static sort()

    //===================================================================================================

    static void sortByMe(int[] nums, int low, int high){

        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end -start)/2;
        int pivot = nums[mid];

        while(start <= end){

            // comparing left elems with pivot, if less the start ++

            while(nums[start] < pivot){
                start++;
            }

            // comparig right elems with pivode, if greater then end--

            while (nums[end] > pivot){
                end--;
            }

            // both conditions violated then swap

            if(start <= end){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

        } // end of outer while(start<=end)

        // now the pivot is at right index, now sorting the other two halves

        sort(nums,low,end);
        sort(nums,start,high);

    }// end of sortByMe



















}// end of class
