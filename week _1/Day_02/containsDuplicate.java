import java.util.HashMap;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (mp.containsKey(nums[i])) {
                return true;
            }

            mp.put(nums[i], 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean ans = containsDuplicate(nums);

        System.out.println(ans);
    }
}