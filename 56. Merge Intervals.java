class Solution {
    public static void sortbyColumn(int arr[][], int col) 
    {
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() {
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else if(entry1[col] < entry2[col])
                return -1; 
            else 
                return 0;
          } 
        });  // End of function call sort(). 
    }
    
    public int[][] merge(int[][] intervals) {
        
        List<int[]> res = new ArrayList<int[]>();
        if (intervals == null || intervals.length == 0) return new int[0][];
        // sort the arrays based on first element from smallest value to large
        sortbyColumn(intervals, 0);
        int[] cur_interval = new int[2];
        
        // ??? 
        cur_interval[0] = intervals[0][0];
        cur_interval[1] = intervals[0][1];
        for (int i = 0; i < intervals.length - 1; i++) {
            if (cur_interval[1] >= intervals[i+1][0]) {
                int[] new_interval = new int[2];
                new_interval[0] = cur_interval[0];
                new_interval[1] = Math.max(cur_interval[1],intervals[i+1][1]);
                //res.add(new_interval);
                cur_interval = new_interval;
            } // merge
            else {
                res.add(cur_interval);
                cur_interval = intervals[i+1]; 
            }
        }
        
        // deal with the last element 
        res.add(cur_interval);
        
        
        
        int[][] resArr = new int[res.size()][2];
        for(int j = 0; j < res.size(); j++) {
            int[] temp = res.get(j);
            resArr[j] = temp;
        }
        return resArr;
        
    }
}


// Time: sort O(nlogn) n is the number of sub arrays, loop: O(n) => total: O(nlogn)

