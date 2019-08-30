class Solution {
    public List<Integer> getRow(int rowIndex) { // 3
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        if (rowIndex == 0) return temp;
        triangle.add(new ArrayList<>(temp));
        temp.add(1);
        if (rowIndex == 1) return temp;
        triangle.add(new ArrayList<>(temp));
        
        //int[] temp = new int[rowIndex + 1];  // [0,0,0,0] => [1,3,3,1]
        for(int i = 2; i <= rowIndex; i++) { // assume rowIndex = 3
            temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++) {
                temp.add(triangle.get(i-1).get(j) + triangle.get(i-1).get(j-1));
            }
            temp.add(1);
            triangle.add(new ArrayList<>(temp));
        }
        return triangle.get(triangle.size()-1);
    }
}

// bad solution but still passes 
