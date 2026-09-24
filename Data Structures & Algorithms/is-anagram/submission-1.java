class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength=s.length();
        if(sLength!=t.length()){
            return false;
        }
        int[] countArray=new int[26];
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        for(int i=0;i<sLength;i++){
            countArray[sa[i]-'a']++;
            countArray[ta[i]-'a']--;          
        }
        for(int j: countArray){
            if(j!=0){
                return false;
            }
        }
        return true;
    }
}
