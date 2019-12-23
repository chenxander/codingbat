public String comboString(String a, String b) {
  String larger = b;
  String smaller = a;
  if (a.length()>b.length()) {
    larger = a;
    smaller = b;
  }
  return smaller+larger+smaller;
}
