class Solution {
    public int[] getConcatenation(int[] nums) {
       int [] nums1=new int[nums.length*2];
       int i=0;
       int j=0;
       while(i<nums1.length){
         nums1[i]=nums[j];
          i++;
          j++;
        if(j==nums.length){
            j=0;
        }
       
       }
       return nums1;

    }
}