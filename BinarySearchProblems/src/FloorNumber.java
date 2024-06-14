public class FloorNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int target= 1;
        System.out.println("Floor of "+ target+" is : "+floor(arr,target));
    }
    static int floor(int[] arr, int target){
        //find the array >= target
        //then find the smallest element

        int start=0;
        int end=arr.length-1;

        if( target < arr[0])
            return -1;
        while(start <= end){
            int mid= start+(end-start)/2;
            if (target > arr[mid]){
                start = mid+1;

            }else if (target < arr[mid]){
                end=mid-1;
            }else{
                return arr[mid];
            }
        }

        return arr[end];
    }
}
