class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;
        int left =0;
        for(int right=0; right<s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2){
                while(map.get(ch) >1){
                    char re = s.charAt(left);
                     map.put(re, map.get(re)-1);
                     left++;
                }
               
            }
         
            len= Math.max(len, right-left+1);
            
            
        }
        
        return len;
        
    }
}