class Solution {
    public void sortColors(int[] nums) {
        
        // use O(n) space 
//         Map<Integer, Integer> countMap = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             countMap.put(nums[i],countMap.getOrDefault(nums[i],0) + 1);
//         }
        
//         int t = 0;
//         //System.out.println(countMap.get(0));
//         if (countMap.containsKey(0)) {
//             for (int j = countMap.get(0); j>0; j--) {
//                 nums[t++] = 0;
//             }
//         }
//         if (countMap.containsKey(1)) {
//             for (int j = countMap.get(1); j>0; j--) {
//                 nums[t++] = 1;
//             }
//         }
        
//         if (countMap.containsKey(2)) {
//             for (int j = countMap.get(2); j>0; j--) {
//                 nums[t++] = 2;
//             }
//         }
        
    // one pass
    int lo = 0, mid = 0, hi = nums.length - 1;
    while (mid <= hi) {
        switch (nums[mid]){
            case 0:
                int temp = nums[lo];
                nums[lo] = nums[mid];
                nums[mid] = temp;
                lo++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                int t = nums[hi]; // temp is already defined in the function 
                nums[hi] = nums[mid];
                nums[mid] = t;
                hi--;
                break;
        }
    }
        
    // two pass
//     int[] cntArr = new int[3];
//     for (int n : nums) {
//         cntArr[n]++;
//     }
        
//     int index = 0;
//     for (int i = 0; i < cntArr.length; i++) {
//         int count = cntArr[i];
//         for (int j = 0; j < count;j++) {
//             nums[index++] = i;
//         }
//     }
        
    }
}
