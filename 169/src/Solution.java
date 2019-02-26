class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int times = 0;
        for (int i=0; i<nums.length; i++) {
            if (ans == nums[i]){
                times++;
            }else{
                times--;
            }
            if (times == 0){
                ans = nums[i+1];
            }
        }
        return ans;
    }

    public static void main() {

    }
}