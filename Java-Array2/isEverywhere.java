public boolean isEverywhere(int[] nums, int val) {
  boolean output = true;
  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] != val && nums[i+1] != val) {
      output = false;
    }
  }
  return output;
}
