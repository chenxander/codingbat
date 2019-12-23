public boolean nearTen(int num) {
  if (num % 10 == 8 || num % 10 == 9
  || num % 10 == 0 || num % 10 == 1 || num % 10 == 2) {
    return true;
  }
  return false;
}
