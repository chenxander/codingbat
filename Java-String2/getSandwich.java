public String getSandwich(String str) {
  if (str.length() < 11) {
    return "";
  }
  ArrayList<Integer> breads = new ArrayList<Integer>();
  for (int i = 0; i < str.length()-4; i++) {
    if (str.substring(i,i+5).equals("bread")) {
      breads.add(i);
    }
  }
  if (breads.size() < 2) {
    return "";
  }
  int minm = breads.get(0)+5;
  int maxm = breads.get(breads.size()-1);
  return str.substring(minm,maxm);
}
