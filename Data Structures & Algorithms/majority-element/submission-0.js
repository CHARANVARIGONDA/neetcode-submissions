class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        if(nums.length==1){
            return nums[0];
        }
        let n=nums.length;
        const map=new Map();
        
        for(let i=0;i<nums.length;i++){
            if(map.has(nums[i])){
                let count=map.get(nums[i])+1;
                map.set(nums[i],count);
                if(map.get(nums[i])>n/2){
                    return nums[i];
                }

            }else{
                map.set(nums[i],1);
            }
        }
        return 0;
    }
}
