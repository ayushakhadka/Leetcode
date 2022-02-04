class Solution {
    
    public boolean isAnagram(int[] parr, int[] sarr){
        for(int i=0; i<parr.length; i++){
            if(parr[i] != sarr[i])
                return false;
        }
        return true;   
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<>();
        
        int slen = s.length();
        int plen = p.length();
        
        if(s==null || slen<plen || s.length() ==0){
            return list;
        }
        
        int[] sarr = new int[26];
        int[] parr = new int[26];
        
        for(int i=0; i<plen; i++){
            parr[p.charAt(i) - 'a']++;
            sarr[s.charAt(i) - 'a']++;
        }
        
        for(int i=0; i< slen-plen; i++){
            if(isAnagram(parr, sarr)){
                list.add(i);
            }
            
            sarr[s.charAt(i) - 'a']--;
            sarr[s.charAt(i+plen) - 'a']++;    // yo line ho nabujeko
        }
        
        if(isAnagram(parr,sarr)){
            list.add(slen-plen);
        }
        
        return list;
    }
}