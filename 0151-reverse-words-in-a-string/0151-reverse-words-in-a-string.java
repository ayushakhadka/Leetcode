class Solution {
    public String reverseWords(String s) {
        
        String[] strArray = s.trim().split("\\s+"); // strArray = ["the", "sky", "is", "blue"];
        String result = "";
        
        for(int i=strArray.length-1; i>=0; i--){
            if(i==0){
                 result = result + strArray[i];
            }else{
                 result = result  + strArray[i] + " " ;
            }
           
        }
        return result;
        
        // blue 
        
        
//         String[] result = new String[strArray.length];
        
//         for (int i=strArray.length; i>0; i--){
//             result.add(strArray[i]); // result = 
//         }
//         String delimiter = "";
//         String res = String.join(delimiter, result);
        
//         return result;    
    }
}