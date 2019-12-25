public int[] pre4(int[] nums) {
  List<Integer> numbers = new ArrayList<Integer>();
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      break;
    }
    numbers.add(nums[i]);
  }
  int[] output = new int[numbers.size()];
  for (int i = 0; i < numbers.size(); i++) {
    output[i] = numbers.get(i);
  }
  return output;
}
