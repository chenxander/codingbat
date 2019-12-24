public String repeatFront(String str, int n) {
  String output = "";
  for (int i = n; i >= 1; i--) {
    output = output + str.substring(0,i);
  }
  return output;
}
