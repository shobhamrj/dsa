class Solution {
    
    public int[] sortedSquares(int[] nums) {
        int[] sqArr=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        
        for(int i=sqArr.length-1; i>-1; i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                sqArr[i]=nums[left]*nums[left];
                left++;
            }
            else{
                sqArr[i]=nums[right]*nums[right];
                right--;
            }
        }
        return sqArr;
    }
} 