public String doubleChar(String str) {
  String output = "";
  for (int i = 0; i < str.length(); i++) {
    output = output + str.charAt(i) + str.charAt(i);
  }
  return output;
}
