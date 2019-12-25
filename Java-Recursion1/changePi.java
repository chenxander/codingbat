public String changePi(String str) {
  if (str.length() < 2) return str;
  if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
    return "3.14" + changePi(str.substring(2));
  } else {
    return str.substring(0,1) + changePi(str.substring(1));
  }
}
