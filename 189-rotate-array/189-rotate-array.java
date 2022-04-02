class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length -1 );
    }
    
    public void reverse(int[] array, int i, int j) {
        while(i < j) {
            int temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
    }
}