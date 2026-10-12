class Solution {
    public int trap(int[] height) {
        int left =0,right = height.length-1,leftMax =0,rightMax=0;
        int maxCap = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(leftMax <= height[left]){
                    leftMax = height[left];
                }
                else{
                    maxCap+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(rightMax <= height[right]){
                    rightMax = height[right];
                }
                else{
                    maxCap+=rightMax-height[right];
                }
                right--;
            }
        }
        return maxCap;
    }
}
