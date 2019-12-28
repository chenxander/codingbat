public int noTeenSum(int a, int b, int c) {
  int[] nums = new int[3];
  nums[0] = a; nums[1] = b; nums[2] = c;
  for (int i=0; i < 3; i++) {
    if (fixTeen(nums[i])) nums[i] = 0;
  }
  int output = 0;
  for (int i: nums) {
    output += i;
  }
  return output;
}

public boolean fixTeen(int n) {
  if (n>=13 && n<=19 && n!=15 && n!=16) return true;
  return false;
}
