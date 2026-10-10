class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,ArrayList<String>>map=new HashMap<>();
      for(int i=0;i<strs.length;i++){
        char[]array=strs[i].toCharArray();
        Arrays.sort(array);
        String key=new String(array);
        if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
      }
       return new ArrayList<>(map.values());
    }
}
