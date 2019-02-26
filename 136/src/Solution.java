import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        /*Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else {
                map.put(nums[i], i);
            }
        }
        return (int)map.keySet().toArray()[0];*/
        int ans = 0;
        for (int num :
                nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main() {

    }
}