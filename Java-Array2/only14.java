public boolean only14(int[] nums) {
  boolean output = true;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 1 && nums[i] != 4) {
      output = false;
    }
  }
  return output;
}
