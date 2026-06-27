class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=1;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                arr[i]*=nums[j];
             
            }
            for(int k=i+1;k<nums.length;k++){
                 arr[i]*=nums[k];
            }
        }
        return arr;
        
    }
}  
