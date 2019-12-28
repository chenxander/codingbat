//courtesy of Akshay Sapra (github)
public String[] allSwap(String[] strings) {
  String[] result=new String[strings.length];
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  for (int i = 0; i < strings.length; i++) {
    char first  = strings[i].charAt(0);
    if (map.containsKey(first)) {
      int temp = map.get(first);
      map.remove(first);
      result[i]=result[temp];
      result[temp]=strings[i];
    } else {
      result[i]=strings[i];
      map.put(first,i);
    }
  }
  return result;
}
