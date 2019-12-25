public int[] zeroFront(int[] nums) {
  int[] output = new int[nums.length];
  List<Integer> marked = new ArrayList<Integer>();
  int zeroCount = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      zeroCount++;
    } else {
      marked.add(nums[i]);
    }
  }
  for (int i = 0; i < zeroCount; i++) {
    output[i] = 0;
  }
  for (int i = 0; i < nums.length-zeroCount; i++) {
    output[i+zeroCount] = marked.get(i);
  }
  return output;
}
