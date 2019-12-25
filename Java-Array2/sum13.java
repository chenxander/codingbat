public int sum13(int[] nums) {
  int output = 0;
  if (nums.length == 0) {
    return 0;
  }
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 13) {
      if (i+1 < nums.length) {
        nums[i+1] = 0;
      }
      nums[i] = 0;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    output += nums[i];
  }
  return output;
}
