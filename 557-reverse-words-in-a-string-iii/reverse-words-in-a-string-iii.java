class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        int n = arr.length;
        for( int i = 0 ; i < n; i++) {
            StringBuilder temp = new StringBuilder(arr[i]);
            sb.append( temp.reverse() );
            if( i < n - 1 ) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}