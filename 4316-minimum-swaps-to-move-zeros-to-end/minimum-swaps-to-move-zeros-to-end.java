class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zerocount = 0;
        int swap = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zerocount++;
            }
        }
        for(int i = n - zerocount; i < n; i++){
            if(nums[i] != 0){
                swap++;
            }
        }
        return swap;

    }
}