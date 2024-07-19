public class QuickSort {
    public static void main(String[] args) {
        int[] nums={3,1,10,8,5,2,3};//1,2,3,5,8,10

        //Algo
        //partition()--> to find the pivot element
        //quicksort left array
        //quicksort right array

        int low=0;
        int high= nums.length-1;

        quickSort(nums,low,high);
        for (int i = 0; i <= nums.length-1; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void quickSort(int[] nums, int low, int high) {

        if(low < high){
            int pivotIndex= partition(nums,low,high);
            quickSort(nums,low,pivotIndex-1);
            quickSort(nums,pivotIndex+1,high);
        }




    }

    private static int partition(int[] nums, int low, int high) {
        int pivot= nums[low]; //first element of the array
        int start=low;
        int end=high;
        while( start< end){
            while(nums[start] <= pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }
            if(start < end){
                swap(nums,start,end);
            }
        }
        swap(nums,low,end);
        return end;
    }

    private static int[] swap(int[] nums, int low, int high) {
        int temp=nums[low];
        nums[low]= nums[high];
        nums[high]= temp;
        return nums;

    }
}
