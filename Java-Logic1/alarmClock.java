public String alarmClock(int day, boolean vacation) {
  if (vacation == true) {
    if (day == 0 || day == 6) {
      return "off";
    } else {
      return "10:00";
    }
  } else {
    if (day == 0 || day == 6) {
      return "10:00";
    } else {
      return "7:00";
    }
  }
}
