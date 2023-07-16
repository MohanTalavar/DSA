import java.util.Arrays;

public class BubbleSort {                   // COMPARE ADJ ELEMS

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){

        // run the steps n-1 times
        boolean swapped;
        for(int i = 0; i< arr.length; i++){

            swapped = false;
            for(int j=1 ; j< arr.length -i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            } // inner for loop

            if(!swapped){ // if swapping doesnt happen i.e its already sorted
                break;
            }

        }// outer for loop

    } // end of bubble

} // end of class
























