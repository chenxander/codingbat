public boolean xyzMiddle(String str) {
  if (str.length() < 3) {
    return false;
  }
  ArrayList<Integer> y = new ArrayList<Integer>();
  for (int i = 1; i < str.length()-1; i++) {
    if (str.charAt(i-1) == 'x' && str.charAt(i) == 'y'
    && str.charAt(i+1) == 'z') {
      y.add(i);
    }
  }
  for (int i = 0; i < y.size(); i++) {
    int temp = Math.abs(str.substring(0,y.get(i)-1).length()
    -str.substring(y.get(i)+2,str.length()).length());
    if (temp <= 1) {
      return true;
    }
  }
  return false;
}
