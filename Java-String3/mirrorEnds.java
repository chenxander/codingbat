//courtesy of mirandio (github)
public String mirrorEnds(String string) {
  StringBuilder output = new StringBuilder();
  for(int i = 0; i < string.length(); i++) {
    if(string.charAt(i) == string.charAt(string.length() - i - 1))
      output.append(string.charAt(i));
    else
      break;
  }
  return output.toString();
}
