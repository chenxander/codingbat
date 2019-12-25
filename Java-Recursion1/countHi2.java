public int countHi2(String str) {
  if (str.equals("hi")) {
    return 1;
  }
  if (str.length() < 3) return 0;
  if (str.charAt(str.length()-1) == 'i' 
  && str.charAt(str.length()-2) == 'h'
  && str.charAt(str.length()-3) != 'x') {
    return 1 + countHi2(str.substring(0,str.length()-1));
  }
  return countHi2(str.substring(0,str.length()-1));
}
