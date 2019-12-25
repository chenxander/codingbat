public boolean lucky13(int[] nums) {
  boolean output = true;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1 || nums[i] == 3) {
      output = false;
    }
  }
  return output;
}
