public int[] withoutTen(int[] nums) {
  int tenCount = 0;
  int[] output = new int[nums.length];
  List<Integer> marked = new ArrayList<Integer>();
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 10) {
      tenCount++;
    } else {
      marked.add(nums[i]);
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (i < marked.size()) {
      output[i] = marked.get(i);
    } else {
      output[i] = 0;
    }
  }
  return output;
}
