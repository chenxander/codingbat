public int sumHeights2(int[] heights, int start, int end) {
  int output = 0;
  for (int i = start; i < end; i++) {
    if (heights[i+1] - heights[i] > 0) {
      output += 2 * (heights[i+1]-heights[i]);
    } else {
      output += Math.abs(heights[i+1] - heights[i]);
    }
  }
  return output;
}
