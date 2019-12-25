public boolean has12(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[j] == 2) {
          return true;
        }
      }
    }
  }
  return false;
}
