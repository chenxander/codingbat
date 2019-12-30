public String withoutString(String base, String remove) {
  char[] array = base.toCharArray();
  for (int i = 0; i <= base.length()-remove.length(); i++) {
    if ((base.substring(i,i+remove.length())).toLowerCase()
    .equals(remove.toLowerCase())) {
      for (int j = i; j < i+remove.length(); j++) {
        array[j] = '.';
      }
      i = i+remove.length()-1;
    }
  }
  String output = "";
  for (char s : array) {
    if (s != '.') output = output + s;
    else continue;
  }
  return output;
}
