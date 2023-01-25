class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int[] list = new int[2];
        
        for(int i=0; i<nums.length; i++){
            
            if(map.containsKey(target-nums[i])){
                list[0] = map.get(target-nums[i]);
                list[1] = i;
                
            }else{
                map.put(nums[i],i);
            }
        }
        return list;
        
    }
}