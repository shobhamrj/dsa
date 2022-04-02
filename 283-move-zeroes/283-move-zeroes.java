class Solution {
    public void moveZeroes(int[] nums) {
        int anchor = 0;
        for(int explorer = 0; explorer < nums.length; explorer++) {
            if(nums[explorer] != 0){
                int temp = nums[explorer];
                nums[explorer] = nums[anchor];
                nums[anchor] = temp;
                anchor++;
            }
            
        }
    }
}