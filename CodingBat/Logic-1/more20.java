public boolean more20(int n) {
  return n%20 == 0 ? false : (n-1)%20 == 0 || (n-2)%20 == 0;
}
