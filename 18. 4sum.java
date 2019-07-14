class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        s.add(temp);
                        start++;
                        end--;
                    }
                    else if (sum < target) {
                        start++;
                    }
                    else {
                        end--;
                    }
                }

            }
        }
        
        
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> tmp : s) {
            res.add(tmp);
        }
        return res;
    }
}

Time complexity: O(N^3)
