public String fizzString2(int n) {
  if (n % 15 == 0) {
    return "FizzBuzz!";
  }
  if (n % 5 == 0) {
    return "Buzz!";
  }
  if (n % 3 == 0) {
    return "Fizz!";
  }
  return Integer.toString(n) + "!";
}
