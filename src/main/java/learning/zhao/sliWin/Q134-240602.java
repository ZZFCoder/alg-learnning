class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int leftSum = 0;

        for(int winLen = 0, l = 0, r = 0; l < len; l++) {
            while(leftSum >= 0) {
                if (winLen == len) {
                    return l;
                }

                r = (l + (winLen++)) % len;
                leftSum += gas[r] - cost[r];
            }
            winLen--;
            leftSum -= gas[l] - cost[l];
        }

        return -1;
    }
}