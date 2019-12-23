public int[] makeLast(int[] nums) {
  int[] output = new int[nums.length * 2];
  output[output.length-1] = nums[nums.length-1];
  return output;
}
