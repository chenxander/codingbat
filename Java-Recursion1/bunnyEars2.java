public int bunnyEars2(int bunnies) {
  if (bunnies == 0) return 0;
  if (bunnies == 1) return 2;
  int ears;
  if (bunnies % 2 == 0) {
    ears = 3;
  } else {
    ears = 2;
  }
  return ears + bunnyEars2(bunnies-1);
}
