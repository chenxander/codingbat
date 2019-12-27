public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s: strings) {
    if (!map.containsKey(s)) {
      map.put(s,s.length());
    }
  }
  return map;
}
