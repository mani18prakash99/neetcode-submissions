class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums,0,temp,ans);

        return ans;
    }

    public void helper(int arr[], int idx, List<Integer> temp, List<List<Integer>> ans){

        if(idx == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[idx]);
        helper(arr,idx+1,temp,ans);
        temp.remove(temp.size()-1);
        helper(arr,idx+1,temp,ans);
    }
}
