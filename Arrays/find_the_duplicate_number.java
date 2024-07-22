class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize the slow and fast pointers to start the cycle detection process
        int slow = nums[nums[0]]; // Slow pointer starts at the first element's value
        int fast = nums[nums[nums[0]]]; // Fast pointer starts two steps ahead

        // Phase 1: Finding the intersection point within the cycle
        while (slow != fast) {
            slow = nums[slow]; // Move slow pointer one step
            fast = nums[nums[fast]]; // Move fast pointer two steps
        }

        // Phase 2: Finding the entrance to the cycle (duplicate number)
        slow = nums[0]; // Reset slow pointer to the start of the array

        while (slow != fast) {
            slow = nums[slow]; // Move slow pointer one step
            fast = nums[fast]; // Move fast pointer one step
        }

        // Return the duplicate number
        return slow;
    }
}
