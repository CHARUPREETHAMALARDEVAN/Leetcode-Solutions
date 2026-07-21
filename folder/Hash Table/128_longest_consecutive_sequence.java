class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int l=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int currnum=n;
                int currl=1;
            
                while(set.contains(currnum+1)){
                    currnum++;
                    currl++;
                }
            
                l=Math.max(l,currl);
            }
        }
        return l;
    }
}
