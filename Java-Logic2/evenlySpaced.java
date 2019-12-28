public boolean evenlySpaced(int a, int b, int c) {
  int[] nums = {a,b,c};
  Arrays.sort(nums);
  if (nums[2]-nums[1] == nums[1]-nums[0]) return true;
  return false;
}
