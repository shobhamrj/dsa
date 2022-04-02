class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum > target)
                    right --;
                else
                    left ++;
                if(Math.abs(currentSum - target) < Math.abs(result - target))
                    result = currentSum;
            }
        }
        return result;
    }
}