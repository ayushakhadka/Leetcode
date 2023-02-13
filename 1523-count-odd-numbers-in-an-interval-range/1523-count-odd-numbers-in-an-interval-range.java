class Solution {
    public int countOdds(int low, int high) {
        
        // iterate 3 - 7
        // if (n % 2 == 1) count++;
        
        int count = (high-low)/2;
        
        if(low % 2 != 0 || high %2 != 0)
            count++;
            
       
        return count;
        
    }
}