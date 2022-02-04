class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums==null || nums.length ==0)
            return 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                nums[i] = -1;
        }
        
        int sum = 0;
        int max = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for(int i=0; i<nums.length; i++){
            int diff = 0;
            sum = sum + nums[i];
            if(map.containsKey(sum)){
                diff = i - map.get(sum);
            }else{
                map.put(sum,i);
            }
            if(diff > max)
                max = diff;
        }
        return max;  
    }
}