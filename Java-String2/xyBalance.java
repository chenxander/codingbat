public boolean xyBalance(String str) {
  if (str.length() == 0) {
    return true;
  }
  boolean output = true;
  ArrayList<String> x = new ArrayList<String>();
  ArrayList<Integer> xMatch = new ArrayList<Integer>();
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x') {
      x.add(""+'x');
      xMatch.add(0);
    } else if (str.charAt(i) == 'y') {
      for (int j = 0; j < x.size(); j++) {
        xMatch.set(j, 1);
      }
    }
  }
  for (int i = 0; i < x.size(); i++) {
    if (xMatch.get(i) == 0) {
      output = false;
    }
  }
  return output;
}
