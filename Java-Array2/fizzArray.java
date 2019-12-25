public int[] fizzArray(int n) {
  int[] output = new int[n];
  if (n == 0) return output;
  for (int i = 0; i < n; i++) {
    output[i] = i;
  }
  return output;
}
