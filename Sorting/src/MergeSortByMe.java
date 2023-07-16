import java.util.Arrays;

public class MergeSortByMe {                //  DIVIDE N MERGE

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1};
        mergeInplaceSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeInplaceSort(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }

        int mid = (start + end )/2;

        // taking arr[] = 5 4 3 2 1  as eg
        // here we are doing partition into left arr and left arr
        // We are sorting single arr i.e main arr[] only
        // 1.0 st iteration left = 5 4 :

        // 1.1 left = 5
        // 1.1 right = 4
        // then merge 1.1 and return to 1.0

        // 1.0 st iteration right = 3 2 1 :

        // 1.1 left = 3
        // 1.1 right = 3 2
        // 1.1.1 left = 3
        // 1.1.1 right = 2
        // then merge 1.1.1 left and right | and return to 1.1
        // then merge 1.1 left & right | and return to 1.0

        // at last merge 1.0 left and right and return to main()


        mergeInplaceSort(arr,start,mid); // 5 4 // here mid is not included i .e index 2 value = 3
        mergeInplaceSort(arr,mid,end); // 3 4 2 // here mid is included i.e index 2 value = 3

        mergeInplace(arr,start,mid,end);

    }// end of M I P S

    static void mergeInplace(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid;
        int k = 0;

        int[] mix = new int[end - start]; // temp array where there will be sorted elems
                                         // which will be used to overwrite main arr[]

        // dumping either of array in mix
        while(i < mid && j < end){

            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // dumping the remaining array may be left or right into mix

        // if the left array which is sorted remaining
        // dumping directly into mix
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        // if the right array which is sorted was remaining;
        // dumping directly into mix
        while(j < end ){
            mix[k] = arr[j];
            j++;
            k++;
        }

        // here mix contains the sorted elems
        // overwriting into main array

        for(int l=0; l<mix.length; l++ ){
            arr[start + l] = mix[l];
        }

        // the main arr must be sorted now.

    } // edn of M I P


} //  end of class
