class Solution {
//     private String sfinal;
//     //private List<String> res = new ArrayList<>();
//     private int count = 0;
//     private boolean stop = false;
    
//     public String getPermutation(int n, int k) {
        
//         backtract(n, "" ,new boolean[n], k);
//         return sfinal;
//     }
    
//     public void backtract(int n, String temp, boolean[] used, int k) {
//         if (temp.length() == n) {
//             //System.out.println(temp);
//             //res.add(temp);
//             count++;
//             if (count == k) {
//                 sfinal = temp;
//                 stop = true;
//                 return;
//             }
//         }
        
//         else {
//             if (stop)
//                 return;
            
//             for (int i = 0; i < n; i++) {
//                 if (!used[i]) {
//                     temp += i+1;
//                     used[i] = true;
//                 } else { continue;}
//                 backtract(n, temp, used, k);
//                 temp = temp.substring(0,temp.length()-1);
//                 used[i] = false;
//             }
//         }

//     }
    
    public String getPermutation(int n, int k) {
        int[] fac = new int[n];
        int j;
        String res = "";
        Arrays.fill(fac,1);
        for (int i = 1; i < fac.length; i++) fac[i] = i * fac[i-1];
        String num = "123456789";
        k--;
        for (int i = n; i >= 1; i--) {
            j = k/fac[i-1];
            k = k%fac[i-1];
            //System.out.println(j);
            //System.out.println(k);
            res += num.substring(j,j+1);
            //System.out.println(res);
            num = num.substring(0,j) + num.substring(j+1);
            //System.out.println(num);
        }
        return res;
    }
    
    // Time: O(n)
    // backtract: O(n!)
    // find rule instead of directly using recursion backtract 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
