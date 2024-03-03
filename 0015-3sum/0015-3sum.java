class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        if(nums.length < 3) return new ArrayList<>(result);
        int n = nums.length;
        for(int k = (n-1); k >=2; k--){
            int i = 0;
            int j = k-1;

            while(i<j){
                if(nums[i]+nums[j] + nums[k] == 0){
                    result.add(List.of(nums[i], nums[j],nums[k]));
                    i++;
                    j--;
                }
                else if((nums[i] + nums[j] + nums[k]) < 0)
                {
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}