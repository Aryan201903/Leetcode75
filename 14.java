// Maximum Number of Vowels in a Substring of Given Length
class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;

        // Initialize the first window and count vowels in it
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Slide the window from k to the end of the string
        for (int i = k; i < s.length(); i++) {
            // Add the new character to the current window
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            // Remove the character that is no longer in the current window
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

// I tried using set to add the vowels but it was giving bad space complexity so had to use normal booleans
