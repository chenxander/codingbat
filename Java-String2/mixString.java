public String mixString(String a, String b) {
  int min = Math.min(a.length(),b.length());
  String output = "";
  for (int i = 0; i < min; i++) {
    output = output + a.charAt(i) + b.charAt(i);
  }
  if (a.length() < b.length()) a = b;
  output = output + a.substring(min, a.length());
  return output;
}
