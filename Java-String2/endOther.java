public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if (a.length() < b.length()) {
    String temp = a;
    a = b;
    b = temp;
  }
  boolean output = true;
  for (int i = a.length()-b.length(); i < a.length(); i++) {
    if (a.charAt(i) != b.charAt(i+b.length()-a.length())) {
      output = false;
    }
  }
  return output;
}
