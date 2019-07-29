class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals("."))
                continue;
            if (arr[i].equals("..")) {
                if (stack.isEmpty()) continue;
                else stack.pop();
            }
            else
                stack.push(arr[i]);
        }
        // return the code 
        
        if (stack.isEmpty()) {
            return "/";
        }
        
        StringBuilder sb = new StringBuilder();
        //sb.append('/');
        
        while (!stack.isEmpty()) {
            sb.insert(0,stack.pop());
            sb.insert(0, '/');
        }
        //sb.deleteCharAt(sb.length()-1);
        String res = sb.toString();
        return res;
    }
}

// Use stack and string.split O(n)
// Space: O(n)
