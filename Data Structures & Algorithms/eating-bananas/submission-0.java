class Solution {
    static int hoursNeed(int[] arr,int speed){
        int hours =0;
        for(int n : arr){
            hours+=(n+speed-1)/speed;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left =1,right =0;
        for(int n:piles) right = Math.max(right,n);
        while(left < right){
            int mid = left +(right - left)/2;
            int hour = hoursNeed(piles,mid);
            if(hour <= h) right = mid;
            else left = mid+1;
        }
        return left;
    }
}
