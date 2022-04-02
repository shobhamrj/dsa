class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            n = Math.abs(n);
            if(nums[n-1] > 0)
                nums[n - 1] *= -1;
            else 
                result.add(n);
        }
        return result;
    }
}