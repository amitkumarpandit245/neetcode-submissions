class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength=s.length();
        if(sLength!=t.length()){
            return false;
        }
        int[] countArray=new int[26];
        for(int i=0;i<sLength;i++){
            countArray[s.charAt(i)-'a']++;
            countArray[t.charAt(i)-'a']--;          
        }
        for(int j: countArray){
            if(j!=0){
                return false;
            }
        }
        return true;
    }
}
