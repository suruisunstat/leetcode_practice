class Solution {
//     public int singleNumber(int[] nums) {
//         Map<Integer, Integer> mapping = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (!mapping.containsKey(nums[i])) {
//                mapping.put(nums[i],1); 
//             } else {
//                 mapping.put(nums[i],mapping.get(nums[i]) + 1);
//             }
//         }
        
//         for(Map.Entry<Integer,Integer> item : mapping.entrySet()) {
//             Integer key = item.getKey();
//             Integer value = item.getValue();
//             if (value == 1) {return key;}
//         }
//         return -1;
//     }
    public int singleNumber(int[] A) {
        if (A.length == 0 || A == null) {return 0;}
        int[] cnt = new int[32];
        
        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j < 32; j++) {
                if ((A[i] >> j & 1) == 1){
                    cnt[j]++;
                }
            }
        }
        
        int res = 0;
        for(int i = 0; i < 32; i++) {
            res += (cnt[i]%3 << i);
        }
        cnt = null;
        return res;
    }
}

// O(n)
