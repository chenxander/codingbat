public int[] frontPiece(int[] nums) {
  if (nums.length <= 2) {
    return nums;
  }
  int[] output = {nums[0],nums[1]};
  return output;
}
