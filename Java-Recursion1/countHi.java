public int countHi(String str) {
  if (str.length() <= 1) return 0;
  if (str.substring(0,2).equals("hi")) {
    str = str.substring(1,str.length());
    return 1 + countHi(str);
  } else {
    str = str.substring(1,str.length());
    return 0 + countHi(str);
  }
}
