public boolean closeFar(int a, int b, int c) {
  if (check(a,b,c)) return true;
  if (check(a,c,b)) return true;
  if (check(b,c,a)) return true;
  return false;
}

public boolean check(int a, int b, int c) {
  if (Math.abs(a-b) <= 1 
  && Math.abs(c-a) >= 2
  && Math.abs(c-b) >= 2) return true;
  return false;
}
