public String sameEnds(String string) {
  for (int i = string.length()/2; i > 0; i--) {
    if (string.substring(0,i)
    .equals(string.substring(string.length()-i,string.length()))) {
      return string.substring(0,i);
    }
  }
  return "";
}
