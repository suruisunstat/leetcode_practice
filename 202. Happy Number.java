class Solution {
    // public boolean isHappy(int n) {
    //     ArrayList<Integer> collection = new ArrayList<>();
    //     String s = Integer.toString(n);
    //     while (true) {
    //         int sum = 0;
    //         for (int i = 0; i < s.length(); i++) {
    //             char cur = s.charAt(i);
    //             int curInt = Integer.parseInt(String.valueOf(cur));
    //             sum += curInt * curInt;
    //         }
    //         if (sum == 1) {return true;}
    //         else if (collection.contains(sum)) {return false;}
    //         else {
    //             collection.add(sum);
    //             s = Integer.toString(sum);
    //         }
    //     }
    // }
    
    public int nextNum(int n) {
        int sum = 0;
        int digit = 0;
        while (n > 0) {
            digit = n%10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }
    
    // public boolean isHappy(int n) {
    //     Set<Integer> hset = new HashSet<Integer>();
    //     while (n != 1 && !hset.contains(n)) {
    //         hset.add(n);
    //         n = nextNum(n);
    //     }
    //     return n == 1;
    // }
    
    
    // hare and tortoise 
    public boolean isHappy(int n) {
        int fast = nextNum(n);
        int slow = n;
        
        while (fast != slow && fast != 1) {
            slow = nextNum(slow);
            fast = nextNum(nextNum(fast)); 
        }
        
        return fast == 1;
    }
}

// Time: O(logn)
// Space: O(logn)


