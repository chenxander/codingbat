public int[] copyEndy(int[] nums, int count) {
  int[] output = new int[count];
  int j = 0;
  for (int i = 0; i < nums.length; i++) {
    if (count != 0 && isEndy(nums[i]) == true) {
      count--;
      output[j] = nums[i];
      j++;
    }
  }
  return output;
}

boolean isEndy(int n) {
  if (n >= 0 && n <= 10
  || n >= 90 && n <= 100) {
    return true;
  }
  return false;
}
