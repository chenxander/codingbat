public int scoresSpecial(int[] a, int[] b) {
  return scoreSpecial(a) + scoreSpecial(b);
}

int scoreSpecial(int[] array) {
  int max = 0;
  for (int i = 0; i < array.length; i++) {
    if (array[i] > max && array[i] % 10 == 0) {
      max = array[i];
    }
  }
  return max;
}
