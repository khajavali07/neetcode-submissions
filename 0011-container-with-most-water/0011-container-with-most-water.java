class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxi = Integer.MIN_VALUE;
        while(i<j){
            int contain = Math.min(height[i],height[j])*(j-i);
            maxi = Math.max(contain,maxi);
            if(height[i]>height[j] && i<j){
                j--;
            }
            else{
                i++;
            }
        }
        return maxi;
    }
}