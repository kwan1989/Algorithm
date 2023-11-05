package leetcode.binarysearch;

public class LeetCode852_PeakIndexinaMountainArray {

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0, 1, 0})); // 1
        System.out.println(peakIndexInMountainArray(new int[]{0, 2, 1, 0})); // 1
        System.out.println(peakIndexInMountainArray(new int[]{0, 10, 5, 2})); // 1
        System.out.println(peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19})); // 2
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;


        while (left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] < arr[mid+1]){
                left = mid +1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
