package bro.maks.JavaAlgorithmsCourse;

public class BiSearch {
    public static void main(String[] args) {

    }
    public static int biSearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return biSearch(arr, target, mid + 1, right);
        } else {
            return biSearch(arr, target, left, mid - 1);
        }
    }
}
