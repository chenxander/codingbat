public int matchUp(String[] a, String[] b) {
  if (a.length == 0 || b.length == 0) return 0;
  int count = 0;
  for (int i = 0; i < Math.min(a.length,b.length); i++) {
    if (!a[i].equals("") && !b[i].equals("")) {
      if (a[i].charAt(0) == b[i].charAt(0)) {
        count++;
      }
    }
  }
  return count;
}
