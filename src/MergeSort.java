public class MergeSort {

    private void merge(int[] arr, int beg, int mid, int end){

        //var awal dengan nilai l dan r
        int l = mid - beg + 1 ;
        int r = end - mid ;

        //var array, menampung niali l & r
        int[] leftArray = new int[l];
        int[] rightArray = new int[r];

        //listing variabel array index
        for (int i=0 ; i < l ; i++ ){
            leftArray[i] = arr[beg+i];
        }
        for (int j=0 ; j < r ; j++ ){
            rightArray[j] = arr[ mid+1+j ];
        }

        // perpindahan posisi
        int i = 0 , j = 0;
        int k = beg ;
        while (i < l && j < r){
            if (leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while ( i < l ){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while ( j < r ){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

    private void sort(int []arr, int beg, int end){
        if (beg < end){
            int mid = (beg+end)/2;
            sort(arr,beg,mid);
            sort(arr, mid+1,end);
            merge(arr,beg,mid,end);
        }
    }

    public static void main(String[] args) {
        int [] arr={90,2,3,4,70,101,7};
        MergeSort obj = new MergeSort();
        obj.sort(arr, 0 , arr.length-1);
        System.out.println("\n sorted array");
        for (int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
