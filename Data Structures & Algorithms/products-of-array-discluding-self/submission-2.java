class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int x = 1;
        boolean zeroPresence = false;
        int zeroCount=0;
        for(int i:nums){
            if(i==0){
                zeroPresence = true;
                zeroCount++;
            }
            else{
                x*=i;
            }  
        }
        if(zeroPresence){
            if(zeroCount>=2){
                for(int i=0;i<nums.length;i++){
                    result[i]=0;
                }
            }
            else{
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                        result[i]=x;
                    }
                    else{
                        result[i]=0;
                    }
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                result[i] = x/nums[i];
            }
        }
        return result;
    }
}  
