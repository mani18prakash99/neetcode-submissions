class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();

        while(!visit.contains(n)){
            visit.add(n);
            n = sumofsq(n);
            if(n == 1){
                return true;
            }
        }

        return false;
    }

    public int sumofsq(int n){
        int op = 0;

        while(n > 0){
            int dig = n % 10;
            dig = dig * dig;
            op = op + dig;
            n = n / 10;
        }

        return op;
    }
}
