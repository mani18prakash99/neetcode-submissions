class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            if(Character.isLetterOrDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }

        String temp = new String(sb.toString());

        int st = 0;
        int ed = temp.length()-1;

        while(st < ed){
            
            if(temp.charAt(st) != temp.charAt(ed)){
                return false;
            }
            st++;
            ed--;
        }

        return true;
    }
}
