public class Solution {
    public int firstMissingPositive(int[] nums) {
        final int n=2000;
        int[] dict = new int[n];
        for(int i:nums){
            if(i>0) dict[i]=1;
        }
        for(int i=0;i<=nums.length;++i){
            if(dict[i+1]==0) return i+1;
        }
        return 0;
    }
}