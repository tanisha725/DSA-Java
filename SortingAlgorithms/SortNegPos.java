public class SortNegPos {
    static void display(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void partition(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {

            while (l < r && nums[l] < 0) {
                l++;
            }

            while (l < r && nums[r] >= 0) {
                r--;
            }

            if (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;

                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-13, 20, 7, -4, -13, 11, -5, -13};

        partition(nums);
        display(nums);
    }
}