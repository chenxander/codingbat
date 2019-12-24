public String plusOut(String str, String word) {
  String[] string = str.split("");
  String output = "";
  ArrayList<Integer> marked  = new ArrayList<Integer>();
  for (int i = 0; i <= str.length()-word.length(); i++) {
    if (str.substring(i,i+word.length()).equals(word)) {
      for (int w = i; w < i+word.length(); w++) {
        marked.add(w);
      }
    }
  }
  for (int i = 0; i < string.length; i++) {
    if (!marked.contains(i)) {
      output = output + "+";
    } else {
      output = output + string[i];
    }
  }
  return output;
}
