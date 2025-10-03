class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String og = String.valueOf(x);
        String rs = new StringBuilder(og).reverse().toString();
        return og.equals(rs);
    }
}
