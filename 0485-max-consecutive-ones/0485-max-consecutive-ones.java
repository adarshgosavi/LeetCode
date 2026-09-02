class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        for(int n : nums){
            if(n == 0){
                j = 0;
            }else {
                j++;
            }
            if(i < j){
                i = j;
            }
        }
        return i;
    }
}