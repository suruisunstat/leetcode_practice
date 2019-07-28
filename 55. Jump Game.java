enum Index {
    GOOD, BAD, UNKNOWN
}

class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
    
//     public boolean canJump(int[] nums) {
//         Index[] memo = new Index[nums.length];
//         for (int i = 0; i < memo.length; i++) {
//             memo[i] = Index.UNKNOWN;
//         }
//         memo[memo.length-1] = Index.GOOD;
        
//         for (int i = nums.length - 2; i >= 0; i--) {
//             int furthestJump = Math.min(i + nums[i], nums.length - 1);
//             for (int j = i + 1; j <= furthestJump; j++) {
//                 if (memo[j] == Index.GOOD) {
//                     memo[i] = Index.GOOD;
//                     break;
//                 }
//             }
//         }
        
//         return memo[0] == Index.GOOD;
//     }
    
//     Index[] memo;
    
//     public boolean canJump(int[] nums) {
//         memo = new Index[nums.length];
//         for (int i = 0; i < memo.length; i++) {
//             memo[i] = Index.UNKNOWN;
//         }
//         memo[memo.length-1] = Index.GOOD;
//         return canJumpFromPosition(0,nums);
//     }
    
//     public boolean canJumpFromPosition(int position, int[] nums) {
//         if (memo[position] != Index.UNKNOWN) {
//             return memo[position] == Index.GOOD ? true : false;
//         }
        
//         int furthestJump = Math.min(nums.length - 1, position + nums[position]);
        
        
//         //if (position == nums.length - 1) return true;
        
//         for(int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
//             if (canJumpFromPosition(nextPosition, nums)) {
//                 memo[position] = Index.GOOD;
//                 return true; // break out of the loop 
//             }
//         }
//         memo[position] = Index.BAD;
//         return false;
//     }
}


// a really good article: 
// https://leetcode.com/problems/jump-game/solution/
