public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] merged = new String[a.length+b.length];
  for (int i = 0; i < a.length+b.length; i++) {
    if (i < a.length) {
      merged[i] = a[i];
    } else {
      merged[i] = b[i-a.length];
    }
  }
  Arrays.sort(merged);
  List<String> cleanMerged = new ArrayList<String>();
  for (int i = 0; i < merged.length-1; i++) {
    if (!merged[i].equals(merged[i+1])) {
      cleanMerged.add(merged[i]);
    }
  }
  if (merged[merged.length-1].equals(merged[merged.length-2])) {
    cleanMerged.add(merged[merged.length-1]);
  }
  String[] output = new String[n];
  for (int i = 0; i < n; i++) {
    output[i] = cleanMerged.get(i); 
  }
  return output;
}
