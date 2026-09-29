            if ((long) mid * mid == x){
                return mid;
            }else if ((long) mid * mid < x ){
                ans = mid ;
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
        int start = 0;
        int end = x;
class Solution {
    public int mySqrt(int x) {