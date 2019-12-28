public int makeChocolate(int small, int big, int goal) {
  for (int i = big; i >= 0; i--) {
    for (int j = 0; j <= small; j++) {
      if (i*5 + j == goal) {
        return j;
      }
    }
  }
  return -1;
}
