class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart = 0;
        int maxLength = 0;
        int maxFrequencyCharacter = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightCharacter = s.charAt(windowEnd);
            charFrequencyMap.put(rightCharacter, charFrequencyMap.getOrDefault(rightCharacter, 0) + 1);
            maxFrequencyCharacter = Math.max(maxFrequencyCharacter, charFrequencyMap.get(rightCharacter));

            if(windowEnd - windowStart + 1 - maxFrequencyCharacter > k) {
                char leftCharacter = s.charAt(windowStart);
                charFrequencyMap.put(leftCharacter, charFrequencyMap.get(leftCharacter) - 1);

                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }

        return maxLength;
    }
}