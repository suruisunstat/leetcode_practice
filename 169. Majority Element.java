class Solution {
    
    // Solution : O(nlogn)
//     public int majorityElement(int[] nums) {
//         return majorityRec(nums,0,nums.length-1);
//     }
    
//     public int CountInRange(int[] nums, int num, int lo, int hi) {
//         int count = 0;
//         for(int i = lo; i <= hi; i++) {
//             if (nums[i] == num)
//                 count++;
//         }
//         return count;
//     }
    
    
//     public int majorityRec(int[] nums, int lo, int hi) {
//         if (lo == hi) return nums[lo];
//         int mid = (lo + hi) /2;
//         int left = majorityRec(nums,lo,mid);
//         int right = majorityRec(nums,mid+1,hi);
//         if (left == right) return left;
//         int leftCount = CountInRange(nums,left,lo,hi);
//         int rightCount = CountInRange(nums,right,lo,hi);
//         return leftCount > rightCount ? left : right;
//     }
        
    // Solution : hashmap O(n)
//         Map<Integer,Integer> count = new HashMap<>();
//         for (int num : nums) {
//             count.put(num,count.getOrDefault(num,0) + 1);
//         }
        
//         for (int key : count.keySet()) {
//             if (count.get(key) > nums.length/2) {
//                 return key;
//             }
//         }
//         return -9999;
    
    // O(n): Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        Integer candidate = null;
        int count = 0;
        for(int num: nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    
}
