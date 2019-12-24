public String repeatEnd(String str, int n) {
  String repeat = str.substring(str.length()-n,str.length());
  String output = repeat;
  for (int i = 0; i < n-1; i++) {
    output = output + repeat;
  }
  return output;
}
