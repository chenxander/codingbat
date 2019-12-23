public int[] make2(int[] a, int[] b) {
  int[] output = new int[2];
  if (a.length >= 2) {
    output[0] = a[0];
    output[1] = a[1];
  } else if (a.length == 1) {
    output[0] = a[0];
    output[1] = b[0];
  } else {
    output[0] = b[0];
    output[1] = b[1];
  }
  return output;
}
