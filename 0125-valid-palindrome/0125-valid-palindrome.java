class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuilder cl = new StringBuilder();
        for(int i=0; i <s1.length();i++){
            char ch = s1.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                cl.append(ch);
            }
        }
        int l=0;
        int r= cl.length()-1;
        while(l<r){
            if(cl.charAt(l) != cl.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}