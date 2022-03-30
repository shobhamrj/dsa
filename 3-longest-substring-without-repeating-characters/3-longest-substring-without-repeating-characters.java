class Solution {
    public int lengthOfLongestSubstring(String s) {
        int aPointer = 0, bPointer = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while(bPointer < s.length()) {
            if(!hashSet.contains(s.charAt(bPointer))){
                hashSet.add(s.charAt(bPointer));
                bPointer ++;
                max = Math.max(max, hashSet.size());
            }
            else {
                hashSet.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}