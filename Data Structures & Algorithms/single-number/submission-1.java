class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> hset = new HashSet<>();

        for(int i : nums){

            if(hset.contains(i)){
                hset.remove(i);
            }else{
                hset.add(i);
            }
        }

        return hset.iterator().next();
    }
}
