class Solution {
    private static final int[] daysBefore = new int[12];
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    

        for(int i = 1; i<12; i++){
            daysBefore[i] = daysBefore[i-1] + monthLength[i-1];
        }

        int aliceStart = toDaysOfYear(arriveAlice);
        int aliceEnd = toDaysOfYear(leaveAlice);
        int bobStart = toDaysOfYear(arriveBob);
        int bobEnd = toDaysOfYear(leaveBob);

        int start = Math.max(aliceStart,bobStart);
        int end = Math.min(aliceEnd,bobEnd);




        return Math.max(0,end-start+1);


        
    }

    private int toDaysOfYear(String date){
        int month = (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
        int day = (date.charAt(3)-'0')*10 + (date.charAt(4) - '0');
        return daysBefore[month -1] + day;

    }
}