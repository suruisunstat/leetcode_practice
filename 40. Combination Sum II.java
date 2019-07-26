class Solution {
    
    private List<List<Integer>> resList;
    private Set<List<Integer>> resSet = new HashSet<List<Integer>>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> resSet1 = backtract(resSet, candidates, target, new ArrayList<Integer>(), 0, new boolean[candidates.length]);
        resList = new ArrayList<List<Integer>>(resSet1);
        return resList;
    }
    
    public Set<List<Integer>> backtract(Set<List<Integer>> resSet, int[] candidates, int target, List<Integer> temp, int curSum, boolean[] used) {
        for(int i = 0; i < candidates.length; i++) {
            if (!used[i]) {
                temp.add(candidates[i]);
                curSum += candidates[i];
                used[i] = true;
                
                if (curSum == target) {
                    List<Integer> tempCopy = new ArrayList<Integer>(temp);
                    Collections.sort(tempCopy);
                    resSet.add(new ArrayList<Integer>(tempCopy));
                    curSum -= temp.get(temp.size()-1);
                    temp.remove(temp.size()-1);
                    used[i] = !used[i];
                }
                
                else if (curSum < target){
                    backtract(resSet,candidates,target,temp, curSum, used);
                    curSum -= temp.get(temp.size()-1);
                    temp.remove(temp.size()-1);
                    used[i] = !used[i];
                }
                
                else {
                    curSum -= temp.get(temp.size()-1);
                    temp.remove(temp.size()-1);
                    used[i] = !used[i];
                    continue; // break
                }
            }
        }
    return resSet;
    }
}

// Very Brute force, not very efficient

// Below is more efficient
// public List<List<Integer>> combinationSum2(int[] candidates, int target){
//         List<List<Integer>> res = new ArrayList<>();
//         if (candidates.length == 0) {
//             return res;
//         }
//         int n = candidates.length;
//         Arrays.sort(candidates);
//         boolean[] visited = new boolean[n];
//         helper(0, new ArrayList<>(), candidates, target, res, visited);
//         return res;
//     }
    
    
//     void helper(int index, List<Integer> list, int[] candidates, int target, List<List<Integer>> res, boolean[] visited) {
//         if (target == 0) {
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         // if (index == candidates.length) {
//         //     return;
//         // }
//         for (int i = index; i < candidates.length; i++) {
//             if (i != index && !visited[i - 1] && candidates[i] == candidates[i - 1]) {
//                 continue;
//             }
//             if (target < candidates[i]) {
//                 break;
//             }
//             visited[i] = true;
//             list.add(candidates[i]);
//             helper(i + 1, list, candidates, target - candidates[i], res, visited);
//             visited[i] = false;
//             list.remove(list.size() - 1);
//         }
//     }
