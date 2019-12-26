public int[] copyEvens(int[] nums, int count) {
  int[] output = new int[count];
  int j = 0;
  for (int i = 0; i < nums.length; i++) {
    if (count != 0 && nums[i] % 2 == 0) {
      count--;
      output[j] = nums[i];
      j++;
    }
  }
  return output;
}
