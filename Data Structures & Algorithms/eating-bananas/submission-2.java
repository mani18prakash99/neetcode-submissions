class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l = 1;
        int r = 0;

        for(int i : piles){
            r = Math.max(i,r);
        }

        if(piles.length == h) return r;

        while(l < r){
            int mid = l + (r-l)/2;

            if(calTime(piles,mid,h) == true){
                r = mid;
            }
            else{
                l = mid+1;
            }
        }

        return l;
    }

    public boolean calTime(int[] piles, int mid, int h){
        int totalTime = 0;

        for(int i : piles){
            totalTime = totalTime + (int)Math.ceil((double)i/mid);
        }

        return totalTime <= h;
    }
}
