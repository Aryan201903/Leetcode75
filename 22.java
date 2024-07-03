// Removing Stars From a String
class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}


// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> st = new Stack<>();
//         char[] arr = s.toCharArray();
        
//         for (int i = 0; i < s.length(); i++) {
//             if (arr[i] == '*') {
//                 st.pop();
//             } else {
//                 st.push(arr[i]);
//             }
//         }
        
//         StringBuilder result = new StringBuilder();
//         while (!st.isEmpty()) {
//             result.insert(0, st.pop());
//         }
        
//         return result.toString();
//     }
