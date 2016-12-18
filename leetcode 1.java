public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int[] nn=new int[nums.length];
        for(int i=0;i<nums.length;++i){
            nn[i]=nums[i];
        }
        Arrays.sort(nums);
        int[] ans=new int[2];
        int a=nums[start]+nums[end];
        while(a!=target){
            if(a>target) end--;
            else start++;
            a=nums[start]+nums[end];
            System.out.println(a);
        }
        boolean flag=true;
        for(int i=0;i<nums.length;++i){
            if(flag&&nn[i]==nums[start]){
                flag=false;
                ans[0]=i;
            }
            if(nn[i]==nums[end]) ans[1]=i;
        }
        return ans;
    }
}