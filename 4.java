// Can place flowers
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyRight = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyLeft = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (emptyRight && emptyLeft) {
                    flowerbed[i] = 1;
                    count++;
                }
                if (count >= n) {
                    return true;
                }
            }
        }
        return (count >= n);
    }
} 
