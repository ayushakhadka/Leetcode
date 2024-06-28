class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int sChar[] = new int[26];
        int tChar[] = new int[26];
        
        for (Character c: s.toCharArray()) {
            sChar[c -'a']++;
        }
        
        for (Character c: t.toCharArray()) {
            tChar[c -'a']++;
        }

        
        if (!Arrays.toString(sChar).equals(Arrays.toString(tChar))){
            return false;
        }
        
        return true;
        
        
    }
}