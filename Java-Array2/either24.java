public boolean either24(int[] nums) {
  boolean twos = false;
  boolean fours = false;
  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] == 2 && nums[i+1] == 2) {
      twos = true;
    } else if (nums[i] == 4 && nums[i+1] == 4) {
      fours = true;
    }
  }
  if (twos == true && fours == true
  || twos == false && fours == false) {
    return false;
  }
  return true;
}
