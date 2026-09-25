class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> hmap = new HashMap<>();

       for(int i=0;i<nums.length;i++){
        hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
       }

       for(int num:nums){
        if(hmap.get(num)>1){
            return true;
        }
       }
       return false;

    }
}