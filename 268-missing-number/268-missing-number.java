class Solution {
    public int missingNumber(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
        }
            int totalNum = nums.length+1;
            for(int i=0; i<totalNum; i++){
                if(!set.contains(i)){
                    return i;
                }
            }
            return -1;
        
        
    }
}