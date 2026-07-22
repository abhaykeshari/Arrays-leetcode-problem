class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int n = sb.length();

            if (n > 0 && sb.charAt(n - 1) == c) {
                sb.deleteCharAt(n - 1); // Pop
            } else {
                sb.append(c); // Push
            }
        }

        return sb.toString();
    }
}