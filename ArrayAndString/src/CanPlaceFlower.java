public class CanPlaceFlower {
    //LC-605. Can Place Flowers
//    Example 1:
//
//    Input: flowerbed = [1,0,0,0,1], n = 1
//    Output: true
//    Example 2:
//
//    Input: flowerbed = [1,0,0,0,1], n = 2
//    Output: false
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

//        for (int i = 0; i < flowerbed.length; i++) {
//            if (flowerbed[i] == 0 &&( i==0 || flowerbed[i - 1] == 0 ) &&
//                    (i==flowerbed.length -1 || flowerbed[i + 1] == 0 )) {
//                flowerbed[i] = 1;
//                n--;
//            }
//            if(n==0){
//                return true;
//            }
//        }

        for(int i = 0 ; i <=flowerbed.length-1 ; i+=2){
            if(i != flowerbed.length-1 && flowerbed[i+1] == 1)
                i++;
            else if(flowerbed[i] == 0){
                n--;
                if(n==0)
                    return true;
            }
        }
        return false;
    }
}
