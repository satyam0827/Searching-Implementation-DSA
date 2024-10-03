package searching;

public class binarSearch {

    //binary search function
    public static int binaryS(int[] arr, int target){
        int left = 0,right = arr.length-1;
        while (left<=right) {

            int mid = left+(right-left)/2;  //formula to find mid 
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left = mid+1; //shifting left to mid+1 if target is greater than mid ele
            }else{
                right = mid-1; //shifting right to mid-1 if target is less than mid ele 
            }
        }
        return -1;
    }

    //main function
    public static void main(String[] args) {
        int[] arr = {1,2,10,25,35,50,65,78}; 
        int target = 65;
        System.out.println(binaryS(arr,target));
    }
}
