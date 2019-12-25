public int[] tenRun(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[j] % 10 == 0) {
          break;
        }
        nums[j] = nums[i];
      }
    }
  }
  return nums;
}
