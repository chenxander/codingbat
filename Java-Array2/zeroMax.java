public int[] zeroMax(int[] nums) {
  if (nums.length < 2) return nums;
  List<Integer> odds = new ArrayList<Integer>();
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      odds.removeAll(odds);
      for (int j = i+1; j < nums.length; j++) {
        if (nums[j] % 2 == 1) {
          odds.add(nums[j]);
        }
      }
      int max = 0;
      if (odds.size()>0) {
        max = odds.get(0);
        for (int w = 1; w < odds.size(); w++) {
          if (max < odds.get(w)) {
            max = odds.get(w);
          }
        }
      }
      nums[i] = max;
    }
  }
  return nums;
}
