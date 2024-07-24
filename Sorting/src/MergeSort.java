import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums={3,1,10,8,5,2,3};
        int low=0;
        int high= nums.length-1;
        System.out.println("Before sorting array: ");
        for (int i = 0; i <= high; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        mergeSort(nums,low,high);
        System.out.println("After sorting array: ");
        for (int i = 0; i <= high; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
    }

    private static void mergeSort(int[] nums, int low, int high) {
        if(low == high) return;
        int mid= low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    private static void merge(int[] nums, int low,int mid, int high) {
        List<Integer> temp= new ArrayList<>();
        int left= low;
        int right=mid+1;// consider the first element of both arrays

        //storing elements in the temporary array in a sorted manner//
        while(left<=mid && right <=high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }
        // if elements on the left half are still left //
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        //  if elements on the right half are still left //
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        //xfr temp to main array;
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

    }
}
