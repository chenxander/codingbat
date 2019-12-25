public int sum67(int[] nums) {
  int output = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6) {
      for (int w = i; w < nums.length; w++) {
        if (nums[w] == 7) {
          for (int j = i; j <= w; j++) {
            nums[j] = 0;
          }
          break;
        }
      }
    }
  }
  for (int i = 0; i < nums.length; i++) {
    output += nums[i];
  }
  return output;
}
