public int[] evenOdd(int[] nums) {
  int[] output = new int[nums.length];
  List<Integer> evens = new ArrayList<Integer>();
  List<Integer> odds = new ArrayList<Integer>();
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      evens.add(nums[i]);
    } else {
      odds.add(nums[i]);
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (i < evens.size()) {
      output[i] = evens.get(i);
    } else if (i < nums.length) {
      output[i] = odds.get(i-evens.size());
    }
  }
  return output;
}
