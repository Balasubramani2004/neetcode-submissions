class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }int max=-1;
        int maxKey=-1;
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue()>max){
                max=x.getValue();
                maxKey=x.getKey();
            }
            

        }
        return maxKey;
    }
}