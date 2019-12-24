public String oneTwo(String str) {
  String output = "";
  for (int i = 0; i < str.length(); i+=3) {
    if (i+2 <= str.length()-1) {
      output = output + str.charAt(i+1) + str.charAt(i+2) + str.charAt(i);
    }
  }
  return output;
}
