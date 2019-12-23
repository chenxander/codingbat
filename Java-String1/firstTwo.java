public String firstTwo(String str) {
  int end = str.length();
  if (str.length() > 2) end = 2;
  return str.substring(0,end);
}
