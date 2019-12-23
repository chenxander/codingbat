public boolean squirrelPlay(int temp, boolean isSummer) {
  if (temp >= 60 && temp <= 90) {
    return true;
  } else if (temp >= 60 && temp <= 100 && isSummer == true) {
    return true;
  } 
  return false;
}
