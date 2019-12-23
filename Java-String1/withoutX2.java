public String withoutX2(String str) {
  if (str.length() == 0) {
    return str;
  }
  if (str.length() == 1) {
    if (str.equals("x")) {
      return "";
    } else {
      return str;
    }
  }
  if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
    return str.substring(1,str.length());
  } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
    return str.charAt(0) + str.substring(2,str.length());
  } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
    return str.substring(2,str.length());
  }
  return str;
}
