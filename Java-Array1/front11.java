public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0) {
    int[] empty = new int[0];
    return empty;
  } else if (a.length != 0 && b.length == 0) {
    int[] output = {a[0]};
    return output;
  } else if (a.length == 0 && b.length != 0) {
    int[] output = {b[0]};
    return output;
  }
  int[] output = {a[0],b[0]};
  return output;
}
