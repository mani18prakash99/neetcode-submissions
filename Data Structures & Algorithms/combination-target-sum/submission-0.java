class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        helper(candidates,0,target,temp,ans);

        return ans;
    }

    public void helper(int arr[], int idx, int target, List<Integer> temp, List<List<Integer>> ans){
        
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(arr[idx] <= target){
            temp.add(arr[idx]);
            helper(arr,idx,target-arr[idx],temp,ans);
            temp.remove(temp.size()-1);
        }

        helper(arr,idx+1,target,temp,ans);
    }
}