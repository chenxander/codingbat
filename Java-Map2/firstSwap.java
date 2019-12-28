public String[] firstSwap(String[] strings) {
  String[] result=new String[strings.length];
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  for (int i = 0; i < strings.length; i++) {
    char first  = strings[i].charAt(0);
    if (map.containsKey(first) == true 
    && map.get(first) != null) {
      int temp = map.get(first);
      map.remove(first);
      result[i]=result[temp];
      result[temp]=strings[i];
      map.put(first,null);
    } else {
      result[i]=strings[i];
      if (!map.containsKey(first)) map.put(first,i);
    }
  }
  return result;
}
