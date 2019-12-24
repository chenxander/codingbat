public boolean xyzThere(String str) {
  if (str.length()<3) {
    return false;
  }
  boolean checkThree = false;
  if (str.length() == 3) {
    checkThree = true;
  }
  if (str.charAt(0) == 'x' || str.charAt(1) == 'y'
  || str.charAt(2) == 'z') {
    return true;
  }
  if (checkThree == false) {
    for (int i = 1; i < str.length()-2; i++) {
      if (str.charAt(i-1) == '.') {
        continue;
      }
      if (str.charAt(i) == 'x' || str.charAt(i+1) == 'y'
      || str.charAt(i+2) == 'z') {
        return true;
      }
    }
  }
  return false;
}
