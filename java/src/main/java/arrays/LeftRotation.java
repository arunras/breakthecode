package arrays;

public classs LeftRotation {

  public static int[] compute(int [] a, int d) {

    for(int i = 0; i <= d; i++) {
      int temp = a[d];
      a[d] = a[i];

    }
  }

}
