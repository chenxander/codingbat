public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s : strings) {
    if (!map.containsKey(""+s.charAt(0))) {
      map.put(""+s.charAt(0),s);
    } else {
      map.put(""+s.charAt(0),map.get(""+s.charAt(0))+s);
    }
  }
  return map;
}
