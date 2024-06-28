class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashSet<Integer> hSet = new HashSet<>();
        for (int i: nums) {
            if (hSet.contains(i)) {
                return true;
            }
            hSet.add(i);
        }
        return false;
    }
}