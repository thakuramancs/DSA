class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ns = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (cnt > 0) {
                    ns.append(s.charAt(i));
                }
                cnt++;
            } else {
                cnt--;
                if (cnt > 0) {
                    ns.append(s.charAt(i));
                }
            }
        }
        
        return ns.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(()())(())";
        System.out.println("The result is: " + sol.removeOuterParentheses(s)); // Output should be "()()()"
    }
}