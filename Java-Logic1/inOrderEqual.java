public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (equalOk == true) {
    if (c >= b && b >= a) {
      return true;
    }
    return false;
  } else {
    if (c > b && b > a) {
      return true;
    }
    return false;
  }
}
