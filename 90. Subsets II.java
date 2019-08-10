class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         List<List<Integer>> res = new ArrayList<>();
        
//         set.add(new ArrayList<>());
//         res.add(new ArrayList<>());
//         if (nums.length == 0) return res;
        
//         Arrays.sort(nums);
        
//         for (int num : nums) {
//             int size = res.size();
//             for (int j = size - 1; j >= 0; j--) {
//                 List<Integer> temp = new ArrayList<>(res.get(j));
//                 temp.add(num);
//                 // sort temp
//                 //Collections.sort(temp);
//                 if (!set.contains(temp)) {
//                     set.add(temp);
//                     res.add(temp);
//                 }
//             }
//         }
        
//         return res;
//     }
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            dfs(res,new ArrayList<Integer>(),nums,i,0);
        }
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int depth, int start) {
        if (temp.size() == depth) {
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for (int j = start; j < nums.length; j++) {
            if (j != start && nums[j] == nums[j-1]) continue;
            temp.add(nums[j]);
            dfs(res,temp,nums,depth,j+1);
            temp.remove(temp.size()-1);
        }
        
    }
    
    
   
}
