class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int requiredChars = tMap.size();
        int windowStart = 0;
        int windowEnd = 0;
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;
        int charsFound = 0;
        Map<Character, Integer> windowMap = new HashMap<>();

        while (windowEnd < s.length()) {
            char currentChar = s.charAt(windowEnd);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (tMap.containsKey(currentChar) && windowMap.get(currentChar).equals(tMap.get(currentChar))) {
                charsFound++;
            }

            while (charsFound == requiredChars && windowStart <= windowEnd) {
                int currentWindowLength = windowEnd - windowStart + 1;
                if (currentWindowLength < minWindowLength) {
                    minWindowLength = currentWindowLength;
                    minWindowStart = windowStart;
                }

                char leftChar = s.charAt(windowStart);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (tMap.containsKey(leftChar) && windowMap.get(leftChar) < tMap.get(leftChar)) {
                    charsFound--;
                }

                windowStart++;
            }

            windowEnd++;
        }

        return minWindowLength == Integer.MAX_VALUE ? "" : s.substring(minWindowStart, minWindowStart + minWindowLength);
    }
}