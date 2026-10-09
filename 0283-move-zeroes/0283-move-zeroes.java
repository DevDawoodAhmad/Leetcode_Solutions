  class Solution{
      public void moveZeroes(int[] nums){
          int length = nums.length;
          int nonZeroSeat = 0;
          for(int i =0;i<length;i++){
              if(nums[i] !=0){
                  if(nonZeroSeat != i){
                  int temp = nums[nonZeroSeat];
                  nums[nonZeroSeat] = nums[i];
                  nums[i] = temp;
                  } 
                  nonZeroSeat++;
              }
          }
      }
  }       








        // By Using Extra Space 

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int length = nums.length;
//         int[] result = new int[length];
        
//         int first = 0;
//         for(int i = 0; i<length; i++){
//             if(nums[i] !=0){
//                 result[first] = nums[i];
//                 first++;
           
//         }}
//          for(int i = 0; i<length;i++){
//              nums[i] = result[i];
//          }

// }
// }