class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        
        Map<String,List<String>> result=new HashMap<>();

        for(String s:strs){
            int[] charCount=new int[26];
            for(char c:s.toCharArray()){
                charCount[c-'a']++;
            }
            StringBuilder k=new StringBuilder();
            for(int c:charCount){
                k.append("#");
                k.append(c);
            }
            String key=k.toString();
            if(!result.containsKey(key)){
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(s);
        }
      return new ArrayList<>(result.values());  
    }
}
