public String[] fizzArray2(int n) {
  String[] output = new String[n];
  if (n == 0) {
    return output;
  }
  for (int i = 0; i < n; i++) {
    output[i] = String.valueOf(i);
  }
  return output;
}
