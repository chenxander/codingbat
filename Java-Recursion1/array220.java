public boolean array220(int[] nums, int index) {
  if (index == nums.length-1) return false;
  if (nums.length == 0) return false;
  if (nums[index] * 10 == nums[index+1]) {
    return true;
  } else {
    index++;
    return array220(nums,index);
  }
}
