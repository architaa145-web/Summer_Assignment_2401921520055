
public class Main {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 1;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }

        }

        return i;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}