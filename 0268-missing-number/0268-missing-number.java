class Solution {
    public int missingNumber(int[] nums) {
        int sumarr=0;
        for(int i=0;i<nums.length;i++)sumarr+=nums[i];
        int n=nums.length;
        int expectedsum=(n*(n+1))/2;
        int reqnum=expectedsum-sumarr;
        return reqnum;
    }
}