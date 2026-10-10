class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        if(nums ==null || length == 0) return nums;
        int evenSeat = 0;
        for(int i = 0; i<length; i++){
           if(nums[i]%2 ==0){
               if(evenSeat !=i){
                   int temp = nums[evenSeat];
                   nums[evenSeat] = nums[i];
                   nums[i] = temp;
               }
               evenSeat++;
           } 
        }
        return nums;
        
    }
}