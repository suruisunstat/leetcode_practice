class Solution {
    private HashMap<Character, Character>mappings;
    
    public Solution() {
        this.mappings = new HashMap<>();
        this.mappings.put(')','(');
        this.mappings.put(']','[');
        this.mappings.put('}','{');
    }
    
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                stack.push(cur);
            }
            else if (stack.isEmpty()) 
                return false;
            
            else if (mappings.get(cur) == stack.peek()) {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    
    
}

// Time complexity: O(n)
// Space complexity: O(n)
