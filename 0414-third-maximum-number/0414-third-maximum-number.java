class Solution{
    public int thirdMax(int[] nums){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for (int num : nums) {
            if (num == first || num == second || num == third) continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}




                  // Working with Integer object working but creating overhead
// class Solution {
//     public int thirdMax(int[] nums) {
//         int length = nums.length;
//         Integer firstMax = null;
//         Integer secondMax = null;
//         Integer thirdMax = null;
//         for(Integer num: nums){
//             if(num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)){
//                 continue;
//             }
//             if(firstMax == null || num>firstMax){
//                 Integer temp = secondMax;
//                 secondMax = firstMax;
//                 thirdMax = temp;
//                 firstMax = num;
//             }
//             else if(secondMax == null || num>secondMax){
//                 thirdMax = secondMax;
//                 secondMax = num;
//             }
//             else if(thirdMax == null || num>thirdMax){
//                 thirdMax = num;
//             }
//         }
//         if(thirdMax != null){
//             return thirdMax;
//         }else{
//             return firstMax;
//         }
        
//     }
// }