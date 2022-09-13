class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num: nums){
            map.put(num,true);
        }  
        for(int num: nums){
            if(map.containsKey(num-1)){
                map.put(num,false);
            }
        }  
        int maxLen = 0;
        for(int num: nums){
            if(map.get(num)==true){
                int len = 1;
                int start = num;
            
                while(map.containsKey(start + len)){
                    len++;
                }
                
                maxLen = Math.max(len,maxLen); 
            }
        }
        return maxLen;
    }
}