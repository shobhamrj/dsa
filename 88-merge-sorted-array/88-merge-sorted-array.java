class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--; n--;
        int index = nums1.length - 1;
        while(index >= 0) {
            if(m < 0) {
                nums1[index] = nums2[n--];
            }else if(n < 0) {
                nums1[index] = nums1[m--];
            }else {
                if(nums1[m] > nums2[n]) {
                    nums1[index] = nums1[m--];
                }else {
                    nums1[index] = nums2[n--];
                }
            }
            index --;
        }
        
    }
}