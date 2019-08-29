class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return res;
        temp.add(1);
        res.add(new ArrayList<>(temp));
        temp = new ArrayList<>();
        if (numRows == 1){
            return res;
        }
        temp.add(1);
        temp.add(1);
        res.add(new ArrayList<>(temp));
        temp = new ArrayList<>();
        if (numRows == 2) {
            return res;
        }
        
        for(int i = 2; i < numRows; i++) {
            List<Integer> prev = res.get(i-1);
            temp.add(1);
            for(int j = 1; j <= i-1; j++) {
                int cur = prev.get(j-1) + prev.get(j);
                temp.add(cur);
            }
            temp.add(1);
            res.add(new ArrayList<>(temp));
            temp = new ArrayList<>();
        }
        return res;
    }
}

// time: O(n^2) where n is the num of rows
// space: O(n)
