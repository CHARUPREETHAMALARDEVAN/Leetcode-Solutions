class Solution {
    public int maxProduct(int[] nums) {
        int pro=nums[0];
        int max=nums[0];
        int min=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(cur<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(cur,cur*max);
            min=Math.min(cur,cur*min);
            pro=Math.max(pro,max);
        }
        return pro;
    }
}
