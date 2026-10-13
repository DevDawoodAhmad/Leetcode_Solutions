class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;
        long[] sq = new long[n];
        for(int i = 0;i<n; i++){
            sq[i]  = nums[i] * nums[i];
        }
        Arrays.sort(sq);
        int plusCount = (n+1)/2;
        int minusCount = n - plusCount;
        long score = 0;

        for(int i = 0;i<minusCount;i++){
            score = score - sq[i];

        }  
        for(int i = minusCount ; i< n; i++){
            score = score + sq[i];
        }

        return score;

        
    }
}