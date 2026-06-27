class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(m.containsKey(temp)){
                return new int[]{m.get(temp),i};
            }
            m.put(nums[i],i);
           
        }
         return new int[]{-1,-1};
    }
}
