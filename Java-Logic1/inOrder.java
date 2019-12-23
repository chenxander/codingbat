public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (bOk == true) {
    if (c > b) {
      return true;
    }
    return false;
  } else {
    if (b > a && c > b) {
      return true;
    }
    return false;
  }
}
