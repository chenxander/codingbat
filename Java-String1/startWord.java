public String startWord(String str, String word) {
  if (str.length() < word.length()) {
    return "";
  }
  if (word.length() == 1) {
    return "" + str.charAt(0);
  }
  if (word.substring(1,word.length()).equals(str.substring(1,word.length()))) {
    return str.substring(0,word.length());
  }
  return "";
}
