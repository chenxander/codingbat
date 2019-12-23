public int[] maxEnd3(int[] nums) {
  for (int i = 0; i < 3; i++) {
    nums[i] = Math.max(nums[0], nums[2]);
  }
  return nums;
}
