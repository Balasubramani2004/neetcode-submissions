class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->m.get(a)-m.get(b)
        );
        for(int i:m.keySet()){
            pq.offer(i);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        int []ans=new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll();
        }
        return ans;
    }
}
