class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int i=0;
        for(int num:nums){
            int needed = target-num;
            if(hmap.containsKey(needed)){
                return new int[]{hmap.get(needed),i};
            }
            else{
                hmap.put(num,i);
                i++;
            }
        }
        return new int[]{};
    }
}
