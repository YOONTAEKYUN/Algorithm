class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer();
        sb.append(x);

        String input = sb.toString();
        String inputRe = sb.reverse().toString();

        if(input.equals(inputRe)){
            return true;
        }else{
            return false;
        }
    }
}