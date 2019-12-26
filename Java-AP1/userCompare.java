public int userCompare(String aName, int aId, String bName, int bId) {
  int alphaOutput = aName.compareTo(bName);
  if (alphaOutput < 0) {
    return -1;
  } else if (alphaOutput > 0) {
    return 1;
  } else {
    if (aId < bId) {
      return -1;
    } else if (aId == bId) {
      return 0;
    } else {
      return 1;
    }
  }
}
