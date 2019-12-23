public boolean twoAsOne(int a, int b, int c) {
  if (a+b==c || b+c==a || a+c==b) {
    return true;
  }
  return false;
}
