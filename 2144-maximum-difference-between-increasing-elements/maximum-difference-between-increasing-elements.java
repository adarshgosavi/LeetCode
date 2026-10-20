class Solution {
    public int maximumDifference(int[] nums) {
        int i = 0;
        int maximum = 0;
        for(int j = 1; j < nums.length; j++){
            if(j > i && nums[j] > nums[i]){
                int temp = nums[j] - nums[i];

                if(temp > maximum){
                    maximum = temp;
                }
            }else{
                i = j;
            }
        }
        if(maximum == 0){
            return -1;
        }
        return maximum;
    }
}