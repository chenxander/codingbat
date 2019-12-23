public int sum3(int[] nums) {
  int total = 0;
  for (int num : nums) {
    total += num;
  }
  return total;
  //Note that you can also directly add them up because
  //you know how many items there are in the array
}
