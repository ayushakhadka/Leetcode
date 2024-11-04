class Solution {
    public String largestNumber(int[] nums) {
        
        if (nums==null){
            return "";
        }

        Comparator<String> comparator = ((a,b)->(b+a).compareTo(a+b));
        List<String> numString = Arrays.stream(nums).mapToObj(n -> String.valueOf(n)).collect(Collectors.toList());
        Collections.sort(numString, comparator);
        
        if("0".equals(numString.get(0))){
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        numString.stream().forEach(s -> sb.append(s));
        return sb.toString();
    }
}