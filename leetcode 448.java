public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        for(int i=1;i<=nums.length;++i){
            if(!map.containsKey(i)){
                ans.add(new Integer(i));
            }
        }
        return ans;
    }
}