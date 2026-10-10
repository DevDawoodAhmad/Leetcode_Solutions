class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if(nums == null || length == 0) return 0;
        int valid = 0;
        for(int i = 0; i<length; i++){
            if(nums[i]!=val){
                if(valid != i){
                    int temp = nums[valid];
                    nums[valid] = nums[i];
                    nums[i] = temp;
                }
                valid++;
            }
            
        }
        return valid;
        
    }
}