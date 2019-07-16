class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        backtract(res, new ArrayList<>(), nums, visited);
        return res;
    }
    
    public void backtract(List<List<Integer>> res, ArrayList<Integer>list, int[] nums, int[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1 || i > 0 && nums[i] == nums[i-1] && used[i-1] == 0) continue;
            used[i] = 1;
            list.add(nums[i]);
            backtract(res,list,nums,used);
            used[i] = 0;
            list.remove(list.size()-1);
        }
    }
}
