public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode == true) {
    if (n <= 1 || n >= 10) {
      return true;
    } else {
      return false;
    }
  } else {
    if (n < 1 || n > 10) {
      return false;
    } else {
      return true;
    }
  }
}
