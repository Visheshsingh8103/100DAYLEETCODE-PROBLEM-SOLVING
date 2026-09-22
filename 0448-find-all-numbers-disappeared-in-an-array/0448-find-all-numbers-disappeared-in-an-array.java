class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>();
       for(int i = 0 ; i < nums.length ; i++){
        int indexVal = Math.abs(nums[i]);
        nums[indexVal - 1] = - Math.abs (nums[indexVal - 1]);
        
       } 
       for(int j = 0 ; j < nums.length ; j++){
        if(nums[j] > 0){
            ans.add(j+1);
        }
       }
       return ans;
    }
}