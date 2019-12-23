public String atFirst(String str) {
  if (str.length() == 1) {
    return str + "@";
  } else if (str.length() == 0) {
    return "@@";
  }
  return str.substring(0,2);
}
