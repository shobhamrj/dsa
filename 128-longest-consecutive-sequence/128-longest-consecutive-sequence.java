class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num: nums){
            s.add(num);
        }
        
        int longestStreak = 0;
        
        for(int num: nums) {
            if(!s.contains(num - 1)) {
                int currStreak = 1;
                int currNum = num;
                while(s.contains(currNum + 1)) {
                    currStreak+=1;
                    currNum+=1;
                    
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        return longestStreak;
    }
}