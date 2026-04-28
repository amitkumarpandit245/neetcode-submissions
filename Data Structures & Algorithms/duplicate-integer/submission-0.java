class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique=new HashSet();
        for(int num:nums) unique.add(num);
        System.out.printf("Set:%d Array: %d",unique.size(),nums.length);
        if(unique.size()!=nums.length){
            return true;
        }
        return false;
    }
}