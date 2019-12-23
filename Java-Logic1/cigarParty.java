public boolean cigarParty(int cigars, boolean isWeekend) {
  if (cigars <= 60 && cigars >= 40) {
    return true;
  } else if (isWeekend == true && cigars >= 40) {
    return true;
  }
  return false;
}
