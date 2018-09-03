/*
Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

*/

class Solution {
    public int longestConsecutive(int[] nums) {
    	int longestLength = 0;
    	Set<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
	    map.add(nums[i]);
    	}
		
    	for (int i = 0; i < nums.length; i++) {
	    int curLength = 0;
	    int cur = nums[i];
	    if (!map.contains(cur-1)) {
	    	while (map.contains(cur)) {
		    curLength++;
		    cur += 1;
	    	}
	    }
    	longestLength = Math.max(curLength, longestLength);
    	}
    return longestLength;
    }
}
