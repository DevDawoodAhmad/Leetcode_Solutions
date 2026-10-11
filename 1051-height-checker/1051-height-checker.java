class Solution {
    public int heightChecker(int[] heights) {
        
        int length = heights.length;
        int notEqual = 0;
        int[] sortedArray = Arrays.copyOf(heights,heights.length);
        for(int i = 0; i<length - 1 ; i++){
            for(int j = i+1; j<length ; j++){
                if(sortedArray[i]>sortedArray[j]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        for(int i = 0; i<length; i++){
            if(sortedArray[i] != heights[i]){
                notEqual++;
            }
            
        }
        return notEqual;
        
    }
}