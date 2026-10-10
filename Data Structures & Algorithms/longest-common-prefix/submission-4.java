class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int i = 1;
        int j = 0;
        String common = "";
        String f = strs[0];

        while (i < strs.length) {
            String s = strs[i];
            if (j >= f.length() || j >= s.length()) {
                return common;
            }
            if (j == 0 && f.charAt(j) != s.charAt(j)) {
                return "";
            } else if (j != 0 && f.charAt(j) != s.charAt(j)) {
                break;
            }

            if (f.charAt(j) == s.charAt(j)) {
                i++;
            }
            if (i == strs.length) {
                common = common + f.charAt(j);
                i = 1;
                j++;
            }
        }
        return common;
    }
}