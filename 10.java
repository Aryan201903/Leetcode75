// Is subsequence
class Solution {
    public boolean isSubsequence(String s, String t) {
        int spoint = 0;
        int tpoint = 0;

        while(spoint < s.length() && tpoint < t.length()){
            if(s.charAt(spoint) == t.charAt(tpoint)){
                spoint++;
            }
            tpoint++;
        } 

        return spoint == s.length();
    }
}
