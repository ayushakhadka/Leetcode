class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length==0)
            return -1;
        
        int totalSum = 0;
        int leftSum = 0;
        
        for(int i : nums){
            totalSum += i;
        }
        
        for(int i=0; i<nums.length; i++){
            if(leftSum == (totalSum - nums[i]))
                return i;
            
            else
                leftSum += nums[i];
                totalSum -= nums[i];
        } 
        return -1;  
    }       
}