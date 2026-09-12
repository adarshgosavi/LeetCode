class Solution {
    public boolean check(int[] nums) {
        int dup = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                dup++;
            }
        }
        if (dup <= 1) {
            return true;
        } else {
            return false;
        }
    }
}