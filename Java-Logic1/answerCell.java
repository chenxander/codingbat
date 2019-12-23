public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep == true) {
    return false;
  }
  if (isMorning == true && isMom == false) {
    return false;
  }
  return true;
}
