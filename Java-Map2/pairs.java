public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s: strings) {
    map.put(String.valueOf(s.charAt(0)),""+s.charAt(s.length()-1));
  }
  return map;
}
