public String[] fizzBuzz(int start, int end) {
  String[] output = new String[end-start];
  for (int i = start; i < end; i++) {
    if (i % 15 == 0) {
      output[i-start] = "FizzBuzz";
    } else if (i % 3 == 0) {
      output[i-start] = "Fizz";
    } else if (i % 5 == 0) {
      output[i-start] = "Buzz";
    } else {
      output[i-start] = String.valueOf(i);
    }
  }
  return output;
}
