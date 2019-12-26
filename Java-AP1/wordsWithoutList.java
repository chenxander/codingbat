public List wordsWithoutList(String[] words, int len) {
  List<String> output = new ArrayList<String>();
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() != len) {
      output.add(words[i]);
    }
  }
  return output;
}
