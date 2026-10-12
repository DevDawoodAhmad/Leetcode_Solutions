// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int length = nums.length; 
//         int[] ssA = new int[length];
//         for(int i=0;i<nums.length;i++){
//             ssA[i] = nums[i]*nums[i];
//             for(int j=i;j>0;j--){
//                 if(ssA[j]<ssA[j-1]){
//                     int temp = ssA[j];
//                     ssA[j] = ssA[j-1];
//                     ssA[j-1] = temp;
//                 }
//             }
//         }
//         return ssA;
        
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length; 
        int[] ssA = new int[length];
        int left = 0;
        int right = length-1;
        int resultPointer = length-1;
        while(left <=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare>rightSquare){
                ssA[resultPointer] = leftSquare;
                left++;
            }
            else{
                ssA[resultPointer] = rightSquare;
                right--;
            }
            resultPointer--;
        }
        return ssA;
    }
}