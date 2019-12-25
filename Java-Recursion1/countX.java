public int countX(String str) {
  if (str.length() == 0) return 0;
  if (str.charAt(str.length()-1) == 'x') {
    str = str.substring(0,str.length()-1);
    return 1 + countX(str);
  } else {
    str = str.substring(0,str.length()-1);
    return 0 + countX(str);
  }
}
