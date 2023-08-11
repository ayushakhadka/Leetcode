class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // handle corner cases : null || 0
        
        if(strs == null || strs.length == 0){
            return "";
        }
        
        // prefix = strs[0];
        String prefix = strs[0];
        
        
        // for loop 
        for(int i=1; i<strs.length; i++){
            
            // while prefix is not in strs[i];
            while(strs[i].indexOf(prefix) != 0){
               // remove last character from prefix
                prefix = prefix.substring(0, prefix.length()-1); // flowe - flow 
            
               // if prefix is empty, return ""
                if(prefix.isEmpty()){
                    return "";
                }      
            }
        } 
        return prefix;
        
    }
}