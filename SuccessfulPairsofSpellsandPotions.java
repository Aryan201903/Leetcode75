class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int s = spells.length;
        int p = potions.length;
        int[] result = new int[s];
        Arrays.sort(potions);
        for (int i = 0; i < s; i++) {
            int spell = spells[i];
            long min = (success + spell - 1) / spell;
            int left = 0;
            int right = p - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (potions[mid] >= min) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = p - left;
        }

        return result;
    }
}
