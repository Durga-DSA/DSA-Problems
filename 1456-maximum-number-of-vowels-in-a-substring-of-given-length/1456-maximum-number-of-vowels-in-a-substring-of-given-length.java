class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0; i<k; i++){
            char Char = s.charAt(i); 
            if(Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u'){
                count ++;
            }
        }

       int  max_count = count;

        for(int i=k; i<s.length(); i++){
            char Char = s.charAt(i); 
            char CharRemove = s.charAt(i-k);

            if(CharRemove == 'a' || CharRemove == 'e' || CharRemove == 'i' || CharRemove == 'o' || CharRemove == 'u' )
                count --;
            
            if(Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u'){
                count ++;
            }

            max_count = Math.max(max_count, count);
        }
        
        return max_count;
    }
}