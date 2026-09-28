class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement=0;
        Map<Integer,Integer> keyMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            complement=target-nums[i];
            if(keyMap.containsKey(complement)){
                return new int[]{keyMap.get(complement),i};
            }
            keyMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
