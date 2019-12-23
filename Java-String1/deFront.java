public String deFront(String str) {    
  if (str.length() == 0) {
    return str;
  }
  if (str.length() == 1) {
    if (str.equals("a")) {
      return str;
    }
    return "";
  }
  if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
    return "a" + str.substring(2,str.length());
  } else if (str.charAt(0) != 'a' & str.charAt(1) == 'b') {
    return "b" + str.substring(2,str.length());
  } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
    return str;
  }
  return str.substring(2,str.length());
}
