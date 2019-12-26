public int sumHeights(int[] heights, int start, int end) {
  int output = 0;
  for (int i = start; i < end; i++) {
    output += Math.abs(heights[i+1] - heights[i]);
  }
  return output;
}
