public boolean endsLy(String str) {
  if (str.length() < 2) {
    return false;
  }
  if (str.substring(str.length()-2,str.length()).equals("ly")) {
    return true;
  }
  return false;
}
