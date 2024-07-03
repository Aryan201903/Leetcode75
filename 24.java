// Asteroid Collision
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            boolean destroyed = false;
            while(!st.isEmpty() && i < 0 && st.peek() > 0){
                if(st.peek() < -i){
                    st.pop();
                    continue;
                }
                else if(st.peek() == -i){
                    st.pop();
                }
                destroyed = true;
                break;
            }
            if(!destroyed){
                st.push(i);
            }
        }
        int[] result = new int[st.size()];
        for(int i = result.length-1 ; i >= 0 ; i--){
            result[i] = st.pop();
        }
        return result;
    }
}
