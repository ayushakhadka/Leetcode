class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        
        int max = 0;
        
        while(left<right){
            int l = height[left];
            int r = height[right];
            
            int minHeight = Math.min(l,r);
            int len = right-left;
            int area = minHeight * len;
            
            max = Math.max(max, area);
            
            if(l<r) left++;
            else right--;
            
        }
        return max;
        
    }
}