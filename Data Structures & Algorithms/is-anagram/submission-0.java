class Solution {
    public boolean isAnagram(String s, String t) {
            int i=0;
        int [] array=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        while(i<s.length()){
            array[s.charAt(i)-'a']++;
            array[t.charAt(i)-'a']--;
            i++;
        }
        for(int j=0;j<array.length;j++){
            if(array[j]!=0){
                return false;
            }
        }
        return true;
    }
}
