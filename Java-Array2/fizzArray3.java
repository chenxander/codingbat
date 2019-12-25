public int[] fizzArray3(int start, int end) {
  int[] array = new int[end-start];
  for (int i = start; i < end; i++) {
    array[i-start] = i;
  }
  return array;
}
