class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int currgas = 0;
    int sum1 = 0;
    int sum2 = 0;
        for(int i=0 ; i<gas.length ; i++){
            sum1 = sum1 + gas[i];
            sum2 = sum2 + cost[i];
        }

        if(sum1 < sum2){
            return -1;
        }
        for(int i=0 ; i<gas.length ; i++){
            currgas = currgas + (gas[i] - cost[i]);


            if(currgas < 0){
                start = i+1;
                currgas = 0;

            }
        }

        return start;
    }
}
