class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //res.add(new ArrayList<>());
        List<Integer> temp = new ArrayList<>();
        dfs(res, temp, nums, 0);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
        res.add(new ArrayList<Integer>(temp));
        for (int i = j; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(res, temp, nums, i+1);
            temp.remove(temp.size() - 1);
        }
    }  
}

O(2^n) ? 
