class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int productWithoutZero = 1;
        int zeroIndex = -1;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                zeroIndex = i; 
                if(zeroCount>=2){
                    return result;
                }
            }
            else{
                productWithoutZero*=nums[i];
            }  
        }
        if(zeroCount==1){
            result[zeroIndex]=productWithoutZero;
            return result;
        }
        else{
            for(int i=0;i<nums.length;i++){
                result[i] = productWithoutZero/nums[i];
            }
        }
        return result;
    }
}  
