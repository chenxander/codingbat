public boolean prefixAgain(String str, int n) {
  String check = str.substring(0,n);
  boolean output = false;
  for (int i = 1; i <= str.length()-n; i++) {
    if (str.substring(i,i+n).equals(check)) { 
      output = true;
    }
  }
  return output;
}
