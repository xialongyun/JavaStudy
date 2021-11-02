package main.code.sort;

public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        //分
        int mid = left + (right - left) / 2;

        //治
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
    }
}
