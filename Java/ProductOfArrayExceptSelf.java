class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int newNums[] = new int[n];
        newNums[0] = 1;
        for(int i =1 ; i<n ; i++){
            newNums[i] = newNums[i-1] * nums[i-1];
        }

        int right = 1;
        for(int i=n-1 ; i >= 0  ; i--){
            newNums[i] = newNums[i] * right;         
            right = right * nums[i];  
        }
        

        return newNums ;
    }
}
