class Solution {
    // method 1:
//     public List<Integer> grayCode(int n) {
//         List<Integer> res = new ArrayList<>();
//         int maxNum = (int)Math.pow(2, n);
//         for(int i = 0; i < maxNum; i++) {
//             int grayCode = binary_to_gray(i);
//             res.add(grayCode);
//         }
//         return res;
//     }
    
//     public int binary_to_gray(int num) {
//         return (num >> 1) ^ num;
//     }
    
    // method 2:
    // public List<Integer> grayCode(int n) {
    //     List<Integer> res = new ArrayList<>();
    //     res.add(0);
    //     for (int i = 0; i < n; i++) {
    //         int size = res.size();
    //         for (int j = size - 1; j >= 0; j--) {
    //             res.add(res.get(j) | 1 << i);
    //         }
    //     }
    //     return res;
    // }
    
    // Time: O(1+2+2^2+2^3+...+2^n) // Space: O()
    
    // method 3:
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 0) {
            res.add(0);
            return res;
        }
        List<String> strings = new ArrayList<>();
        strings.add("");
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            int size = strings.size();
            for (int j = 0; j < size; j++) {
                temp.add("0" + strings.get(j));
            }
            for (int j = strings.size()-1;j>=0;j--) {
                temp.add("1" + strings.get(j));
            }
            strings = temp;
        }
        
        for(String s: strings){
            res.add(Integer.parseInt(s,2));
        }
        return res;
    }
    
}
