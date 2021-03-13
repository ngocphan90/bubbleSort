public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 1, 4, 6};
        int count = numIdenticalPairs(nums);
        System.out.println("Number of good pair: " + count);
    }

    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (i < j))
                    count += 1;
            }
        }
        return count;

    }
}

