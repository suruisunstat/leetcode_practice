class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length; // 5
        int nextAmt = -1;
        boolean interrupt = false;
        for(int i = 0; i < N; i++) { // start index i=3
            interrupt = false;
            int amt = gas[i];
            //System.out.println("Amt: " + amt);
            for(int j = 0; j < N; j++) {
                if (j != N-1) {
                    nextAmt = amt - cost[(i+j)%N] + gas[(i+j+1)%N];
                    //System.out.println("NextAmt: " + nextAmt);
                }
                else {
                    nextAmt = amt - cost[(i+j)%N];
                    //System.out.println("else NextAmt: " + nextAmt);
                }
                
                //System.out.println(amt - cost[(i+j)%N]);
                if (amt - cost[(i+j)%N] < 0) {
                    interrupt = true;
                    break;
                }
                //if (nextAmt < 0) {continue;}
                amt = nextAmt;
            }
            if (amt >= 0 && !interrupt) return i;
        }
        return -1;
    }
    
        public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length == 0 || cost.length == 0 || gas.length != cost.length) {return -1;}
        
        int sum = 0;
        int total = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            
            if (sum < 0) {
                sum = 0;
                index = i + 1;
            }
        }
        
        if (total < 0) return -1;
        return index;
    }
}
