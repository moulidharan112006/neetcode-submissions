class Solution {
    public int maxArea(int[] heights) {
        int left =0,right = heights.length-1;
        int maxCap = 0;
        while(left < right){
            int cap = (right - left)*Math.min(heights[left],heights[right]);
            maxCap = Math.max(cap,maxCap);
            if(heights[left] <= heights[right]) left++;
            else if(heights[right] < heights[left]) right--;
        }
        return maxCap;
    }
}
