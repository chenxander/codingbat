public String wordEnds(String str, String word) {
  String output = "";
  ArrayList<String> marked = new ArrayList<String>();
  if (word.length() >= str.length()) {
    return "";
  }
  if (str.substring(0,word.length()).equals(word)) {
    if (word.length() <= str.length()) {
      marked.add(""+str.charAt(word.length()));
    }
  }
  for (int i = 1; i < str.length()-word.length(); i++) {
    if (str.substring(i,i+word.length()).equals(word)) {
      marked.add(""+str.charAt(i-1));
      marked.add(""+str.charAt(i+word.length()));
    }
  }
  if (str.substring(str.length()-word.length(),str.length()).equals(word)) {
    marked.add(""+str.charAt(str.length()-word.length()-1));
  }
  for (int i = 0; i < marked.size(); i++) {
    output = output + marked.get(i);
  }
  return output;
}
