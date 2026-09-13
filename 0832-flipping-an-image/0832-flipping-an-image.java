class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) {
        int end = arr.length - 1;
        int start = 0;

        while (start <= end) {
            int temp = 1 - arr[end];
            arr[end] = 1 - arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
    return image;
    }
}