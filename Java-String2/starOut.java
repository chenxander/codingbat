public String starOut(String str) {
  String[] string = str.split("");
  String output = "";
  if (str.length() == 0) {
    return "";
  }
  if (str.length() == 1) {
    if (str.equals("*")) {
      return "";
    } else {
      return str;
    }
  }
  if (string[0].equals("*")) {
    if (!string[1].equals("*")) {
      string[0] = ".";
      string[1] = ".";
    } else {
      string[0] = ".";
    }
  }
  for (int i = 1; i < string.length; i++) {
    if (string[i].equals("*")) {
      string[i-1] = ".";
      string[i] = ".";
      if (i != string.length-1 && !string[i+1].equals("*")) {
        string[i+1] = ".";
      }
    }
    
  }
  for (int i = 0; i < string.length; i++) {
    if (string[i].equals(".")) {
      continue;
    } else {
      output = output + string[i];
    }
  }
  return output;
}
