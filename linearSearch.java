package searching;

public class linearSearch {
    
    public static int linearS(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 10, 16, 56 };
        int target = 56;
        System.out.println(linearS(arr, target));
    }
}
