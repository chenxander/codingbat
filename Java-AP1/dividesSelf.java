public boolean dividesSelf(int n) {
  int count = 0;
  boolean output = true;
  int temp = n;
  int temp2 = n;
  while(temp > 0) {
		temp /= 10;
		count++; 
	}
  for (int i = 0; i < count; i++) {
    if (n % 10 != 0) {
      if (temp2 % (n % 10) != 0) {
        output = false;
      }
    } else {
      output = false;
    }
    n /= 10;
  }
  return output;
}
