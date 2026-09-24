class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countArray=new int[26];
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                countArray[s.charAt(i)-'a']++;
                countArray[t.charAt(i)-'a']--;
            }
            for(int j=0;j<26;j++){
                if(countArray[j]!=0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
