class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap();
        
        int left = 0;
        int right = 0;
        
        int res = 0;
        
        while(right < s.length()){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            while(map.get(ch) > 1){
                char l = s.charAt(left);
                map.put(l, map.get(l)-1);
                left++;
            }
            
            res = Math.max(res, right-left+1);
            right++;
        }
        
        return res;
  
    }
}