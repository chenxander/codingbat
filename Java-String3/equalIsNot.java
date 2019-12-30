public boolean equalIsNot(String str) {
  if (str.length() == 0) {
    return true;
  }
  int countIs = 0;
  int countNot = 0;
  for (int i = 0; i <= str.length()-3; i++) {
    if (str.substring(i,i+3).equals("not")) {
      countNot++;
    } else if (str.substring(i,i+2).equals("is")) {
      countIs++;
    }
  }
  if (str.substring(str.length()-2,str.length()).equals("is")) {
    countIs++;
  }
  if (countIs == countNot) {
    return true;
  }
  return false;
}
