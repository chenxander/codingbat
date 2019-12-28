public boolean makeBricks(int small, int big, int goal) {
  for (int i = 0; i <= big; i++) {
    for (int j = 0; j <= small; j++) {
      if (i*5 + j == goal) {
        return true;
      }
    }
  }
  return false;
}
