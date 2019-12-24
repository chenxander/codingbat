public boolean catDog(String str) {
  if (str.length() < 3) {
    return true;
  }
  int dog = 0;
  int cat = 0;
  for (int i = 0; i < str.length()-2; i++) {
    if (str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g') {
      dog++;
    } else if (str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
      cat++;
    }
  }
  return (cat == dog);
}
