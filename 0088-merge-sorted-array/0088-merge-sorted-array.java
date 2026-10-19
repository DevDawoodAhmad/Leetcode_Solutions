class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length;
        int length1= m -1;
        int length2 = n -1;
        
        
    
        while(length2 >=0){
            if(length1>=0 && nums1[length1]>nums2[length2]){
                nums1[length-1] = nums1[length1];
                length1--;
                length--;
            }
            else{
                nums1[length -1] = nums2[length2];
                length2--;
                length--;
            }
        
    }
}}