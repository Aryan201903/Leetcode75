// Unique Number of Occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> occurrences = new HashSet<>();
        for (int count : frequencyMap.values()) {
            if (!occurrences.add(count)) {
                return false; 
            }
        }
        return true;
    }
}
