package searching;

public class binarSearch {
    public static int binaryS(int[] arr, int target){
        int left = 0,right = arr.length-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,10,25,35,50,65,78};
        int target = 65;
        System.out.println(binaryS(arr,target));
    }
}
