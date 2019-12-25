public int centeredAverage(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] > max) {
      max = nums[i];
    }
    if (nums[i] < min) {
      min = nums[i];
    }
  }
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
  }
  sum = sum - max - min;
  int output = sum / (nums.length-2);
  return output;
}
