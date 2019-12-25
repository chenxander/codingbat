public boolean tripleUp(int[] nums) {
  if (nums.length < 3) {
    return false;
  }
  for (int i = 0; i < nums.length-2; i++) {
    if (nums[i] == nums[i+1]-1 && nums[i+1] == nums[i+2]-1) {
      return true;
    }
  }
  return false;
}
