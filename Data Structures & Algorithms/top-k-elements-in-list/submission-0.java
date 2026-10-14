class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency=new HashMap<>();
        for(int num:nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        List<Integer>[] freqList=new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            freqList[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e:frequency.entrySet()){
            int num=e.getKey();
            int freq=e.getValue();
            freqList[freq].add(num);
        }
        int[] res=new int[k];
        int index=0;
        for(int i=freqList.length-1; i>0;i--){
            for(int num:freqList[i]){
                res[index++]=num;
                if(index==k){
                    return res;
                }
            }

        }
        return res;
        
    }
}
