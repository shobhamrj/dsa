class Solution {
    public boolean detectCapitalUse(String word) {
        
        boolean stat = false;
        
        if( word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            stat = true;
        else if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            stat = true;
            for(int i = 1; i < word.length(); i++) {
                if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                    stat &= true;
                else
                    stat &= false;
            }        
        }
        return stat;
        
        
    }
}