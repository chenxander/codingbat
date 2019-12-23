public String seeColor(String str) {
  if (str.length() < 3) {
    return "";
  }
  if (str.length() < 4) {
    if (str.substring(0,3).equals("red")) {
      return "red";
    } else {
      return "";
    }
  }
  if (str.substring(0,3).equals("red")) {
    return "red";
  } else if (str.substring(0,4).equals("blue")) {
    return "blue";
  }
  return "";
}
