public int[] post4(int[] nums) {
  int max = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      max = i;
    }
  }
  int[] output = new int[nums.length-max-1];
  for (int i = max+1; i < nums.length; i++) {
    output[i-max-1] = nums[i];
  }
  return output;
}
