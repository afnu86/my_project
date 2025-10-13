class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length() - 1;

        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
             
                sb.deleteCharAt(i);
                if (isPalindrome(sb)) return true;
                sb.insert(i, s.charAt(i));
               
                sb.deleteCharAt(j);
                if (isPalindrome(sb)) return true;
                sb.insert(j, s.charAt(j)); 

                return false; 
            }
            i++;
            j--;
        
        }
        return true; 
    
    }
    boolean isPalindrome(StringBuilder sb) {
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}