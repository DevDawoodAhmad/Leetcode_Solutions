class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        // Is the "table" seated in increasing or decreasing cyclic order?
        boolean inc = true, dec = true;
        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n];                // wrap around like a clock
            if (next != (nums[i] + 1) % n) inc = false;
            if (next != (nums[i] - 1 + n) % n) dec = false;
        }

        if (inc) {
            int i = indexOf(nums, 0);
            // rotate left i times, or reverse + rotate (n-i) + reverse
            return Math.min(i, n - i + 2);
        }
        if (dec) {
            int q = indexOf(nums, n - 1);
            if (q == 0) return 1;                        // already [n-1,...,0]
            // rotate then reverse, or reverse then rotate
            return Math.min(q + 1, n - q + 1);
        }
        return -1;                                       // not a rotation of either order
    }

    private int indexOf(int[] a, int v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
    }
}