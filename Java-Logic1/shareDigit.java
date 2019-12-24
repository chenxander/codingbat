public boolean shareDigit(int a, int b) {
  int aTen = a/10;
  int bTen = b/10;
  if (aTen == bTen || aTen == b % 10
  || a % 10 == bTen || a % 10 == b % 10) {
    return true;
  } 
  return false;
}
