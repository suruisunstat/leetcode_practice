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
