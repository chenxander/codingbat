public String lastChars(String a, String b) {
  if (a.equals("") && b.equals("")) {
    return "@@";
  } else if (a.equals("") && b.length() != 0) {
    return "@" + b.charAt(b.length()-1);
  } else if (a.length() != 0 && b.equals("")) {
    return a.charAt(0) + "@";
  } else {
    return "" + a.charAt(0) + b.charAt(b.length()-1);
  }
}
