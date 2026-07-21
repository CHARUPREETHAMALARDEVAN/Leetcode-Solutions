class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            Long currentnum=(long) nums[i];
            Long celling=set.ceiling(currentnum);
            if(celling!=null && celling-currentnum<=valueDiff){
                return true;
            }
            Long floor=set.floor(currentnum);
            if(floor!=null && currentnum-floor<=valueDiff){
                return true;
            }
            set.add(currentnum);
            if(i>=indexDiff){
                set.remove((long)nums[i-indexDiff]);
            }

        }
        return false;
    }
}
