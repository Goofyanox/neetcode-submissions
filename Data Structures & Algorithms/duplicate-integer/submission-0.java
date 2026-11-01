class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> Pubg = new HashSet<>();
    for(int i =0; i < nums.length; i++){
        if(Pubg.contains(nums[i])){
            return true;
        }
            Pubg.add(nums[i]);

        }
        return false;
    }
    }

