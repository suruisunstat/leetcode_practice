class Solution {
    private List<List<Integer>> resList;
    private Set<List<Integer>> resSet = new HashSet<List<Integer>>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> resSet1 = backtract(resSet, candidates, target, new ArrayList<Integer>(), 0);
        resList = new ArrayList<List<Integer>>(resSet1);
        return resList;
    }
    
    // public int sumArr(List<Integer> temp) {
    //     int sum = 0;
    //     for(int i = 0; i < temp.size(); i++) {
    //         sum += temp.get(i);
    //     }
    //     return sum;
    // }
    
    public Set<List<Integer>> backtract(Set<List<Integer>> resSet, int[] candidates, int target, List<Integer> temp, int curSum) {
        for(int i = 0; i < candidates.length; i++) {
            temp.add(candidates[i]);
            curSum += candidates[i];
            if (curSum == target) {
                List<Integer> tempCopy = new ArrayList<Integer>(temp);
                Collections.sort(tempCopy);
                resSet.add(new ArrayList<Integer>(tempCopy));
                curSum -= temp.get(temp.size()-1);
                temp.remove(temp.size()-1);
            }
            else if (curSum < target){
                backtract(resSet,candidates,target,temp, curSum);
                curSum -= temp.get(temp.size()-1);
                temp.remove(temp.size()-1);
            }
            else {
                curSum -= temp.get(temp.size()-1);
                temp.remove(temp.size()-1);
                continue; // break
            }
        }
        return resSet;
    }
}

// Using backtract and hashset, not very efficient though 

// Below is more efficient: not using hashset, sort arrays first, remove the duplicate computation 
//     List<List<Integer>> ans = new ArrayList();
//     public List<List<Integer>> combinationSum(int[] candidates, int target){
//         Arrays.sort(candidates);
//         backtrack(new ArrayList<Integer>(), candidates, target, 0);
//         return ans;
//     }
    
//     public void backtrack(List<Integer> sub_list, int[] nums, int target, int begin){
//         if(target == 0){
//             ans.add(new ArrayList<Integer>(sub_list));
//             return;
//         }
//         for(int i = begin; i < nums.length && target >= nums[i]; i++){
//             sub_list.add(0, nums[i]);
//             backtrack(sub_list, nums, target - nums[i], i);
//             sub_list.remove(0);
//         }
//     }
