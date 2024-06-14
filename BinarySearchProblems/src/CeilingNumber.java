public class CeilingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int target= 2;
        System.out.println("Ceiling of "+ target+" is : "+ceiling(arr,target));
    }
    static int ceiling(int[] arr, int target){
        //find the array >= target
        //then find the smallest element

        int start=0;
        int end=arr.length-1;

        if( target > arr[arr.length-1])
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

        return arr[start];
    }
}
