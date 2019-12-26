public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> output = new HashMap<String, Integer>();
  String check = "";
  for (int i = 0; i < strings.length; i++) {
    if (!check.contains(strings[i])) {
      check = check + strings[i];
      output.put(strings[i],0);
    }
  }
  return output;
}
