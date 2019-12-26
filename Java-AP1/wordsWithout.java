public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      count++;
    }
  }
  String[] output = new String[count];
  int j = 0;
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      output[j] = words[i];
      j++;
    }
  }
  return output;
}
