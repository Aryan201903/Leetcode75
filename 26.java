// Number of recent calls 
class RecentCounter {
    Queue<Integer> que; 
    public RecentCounter() {
        que = new LinkedList<>();
    }
    public int ping(int t) {
        if(que.size() == 0){
            que.add(t);
            return 1;
        }
        else{
            if(t <= 3000){
                que.add(t);
            }
            else{
                int margin = t - 3000;
                while(que.size() != 0 && que.peek() < margin){
                    que.poll();
                }
                que.add(t);
            }
            return que.size();
        }
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
