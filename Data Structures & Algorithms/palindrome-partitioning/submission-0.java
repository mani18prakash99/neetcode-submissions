class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        helper(0,0,s,temp,ans);

        return ans;
    }

    public void helper(int i, int j, String s, List<String> temp, List<List<String>> ans){

        if(j >= s.length()){
            if(i == j){
                ans.add(new ArrayList<>(temp));
            }

            return;
        }


        if(palin(s,i,j)){
            temp.add(s.substring(i,j+1));
            helper(j+1,j+1,s,temp,ans);
            temp.remove(temp.size()-1);
        }

        helper(i,j+1,s,temp,ans);
    }

    public boolean palin(String str, int s, int e){

        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
}