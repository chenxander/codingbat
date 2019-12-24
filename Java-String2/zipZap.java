public String zipZap(String str) {
  String output = "";
  List<Integer> marked = new ArrayList<Integer>();
  for (int i = 0; i < str.length()-2; i++) {
    if (str.charAt(i) == 'z' && 
    str.charAt(i+2) == 'p') {
      marked.add(i+1);
    }
  }
  for (int i = 0; i < str.length(); i++) {
    if (marked.contains(i)) {
      continue;
    } else {
      output = output + str.charAt(i);
    }
  }
  return output;
}
