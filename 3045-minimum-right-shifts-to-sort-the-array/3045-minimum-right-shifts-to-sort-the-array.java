class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        List<Integer> original = new ArrayList<>(nums); // Make a copy

        for (int shift = 0; shift < n; shift++) {
            if (isSorted(nums)) {
                return shift;
            }

            // Right shift once
            int last = nums.get(n - 1);
            for (int i = n - 1; i > 0; i--) {
                nums.set(i, nums.get(i - 1));
            }
            nums.set(0, last);
        }

        return -1;
    }

    private boolean isSorted(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
