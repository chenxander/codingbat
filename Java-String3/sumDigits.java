public int sumDigits(String str) {
  int output = 0;
  for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
      output += str.charAt(i) - '0';
    }
  }
  return output; 
}
