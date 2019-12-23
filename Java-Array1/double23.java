public boolean double23(int[] nums) {
  if (nums.length < 2) {
    return false;
  }
  
  int count2 = 0;
  int count3 = 0;
  for (int i = 0; i < 2; i++) {
    if (nums[i] == 2) {
      count2++;
    }
    if (nums[i] == 3) {
      count3++;
    }
  }
  //obviously not the most optimal way to do it
  //you can directly check as well
  
  if (count2 == 2 || count3 == 2) {
    return true;
  }
  return false;
}
