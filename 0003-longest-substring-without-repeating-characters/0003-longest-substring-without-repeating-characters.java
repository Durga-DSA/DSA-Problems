class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null)
            return 0;

        int left = 0;
        Set<Character> set = new HashSet<>();
        int max_len = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max_len = Math.max(max_len, i-left+1);
        }
        return max_len;        
    }
}