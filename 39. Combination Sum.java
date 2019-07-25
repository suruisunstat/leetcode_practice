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
