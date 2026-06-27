class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(candidates,0,0,target,temp,ans);

        return ans;
    }

    public void helper(int arr[], int idx, int currsum, int target, List<Integer> temp, List<List<Integer>> ans){

        if(currsum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(currsum > target || idx == arr.length){
            return;
        }

        temp.add(arr[idx]);
        helper(arr,idx+1,currsum+arr[idx],target,temp,ans);
        temp.remove(temp.size()-1);
        while (idx + 1 < arr.length && arr[idx] == arr[idx + 1]) {
            idx++;
        }
        helper(arr,idx+1,currsum,target,temp,ans);
    }
}