public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  String output = "";
  for (String s: strings) {
    if (!map.containsKey(s)) {
      map.put(s,1);
    } else {
      map.put(s, map.get(s)+1);
      if (map.get(s) % 2 == 0) {
        output = output + s;
      }
    }
  }
  return output;
}
