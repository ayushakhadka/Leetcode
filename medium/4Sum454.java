class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        /**
        logic: find sum of nums1 + nums2 , then nums3 + nums4
               
        */
        
        HashMap<Integer, Integer> map1 = new HashMap<>(); 
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                
                map1.putIfAbsent(sum,0);
                map1.put(sum,map1.get(sum)+1);
            }
        }
        for(int i=0; i<nums3.length; i++){
            for(int j=0; j<nums4.length; j++){
                int sum = nums3[i] + nums4[j];
                
               map2.putIfAbsent(sum,0);
                map2.put(sum,map2.get(sum)+1);
            }
        }
        
        int count = 0;
        for(Map.Entry e : map1.entrySet()){
            int key = (int)e.getKey();
            int value = (int)e.getValue();
            if(map2.containsKey(-key)){
                count += (value * map2.get(-key));
            }
        }
        return count;
        
    }
}