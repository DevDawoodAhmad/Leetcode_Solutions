// Learned Approach Scan and Verify 

class Solution{
    public int removeDuplicates(int[] nums){
        int length =  nums.length;
        if(nums==null || length == 0) return 0;

        int writeIndex = 1;
        for(int scanIndex = 1;scanIndex<length;scanIndex++){
            if(nums[scanIndex] != nums[writeIndex-1]){
                nums[writeIndex] = nums[scanIndex];
                writeIndex++;
            }

        }
        return writeIndex;
    }
}
// My Previous Approach to solve 
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int length = nums.length;
//         int j = 0;
//         int j_1 = 0;
    
//         for(int i = 0; i<length; i++){
//             j_1 = j+1;
            
//             while(j_1<nums.length && (nums[j]== nums[j_1])){
//                 j_1++;
//                 length--;
//             }
//             if(j_1< nums.length){
//             nums[i+1] = nums[j_1];
//             j = j_1;
//             }
            
//         }
//         return length;
        
//     }
// }