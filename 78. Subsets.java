class Solution {
    //private List<List<Integer>> res = new ArrayList<>();
    
    // public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     //res.add(new ArrayList<>());
    //     List<Integer> temp = new ArrayList<>();
    //     dfs(res, temp, nums, 0);
    //     return res;
    // }
    
    // public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
    //     res.add(new ArrayList<Integer>(temp)); // essential to add a copy of temp arraylist
    //     for (int i = j; i < nums.length; i++) {
    //         temp.add(nums[i]);
    //         dfs(res, temp, nums, i+1);
    //         temp.remove(temp.size() - 1);
    //     }
    // }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            int size = res.size();
            for(int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(res.get(i)); // this step is essential because otherwise the value in res will be updated
                //List<Integer> temp = res.get(i); 
                temp.add(num);
                res.add(temp);
            }
            //System.out.println(res.size());
        }
        return res;
    }
    
// O(2^n)    
}

