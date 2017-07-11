class ArrayInit {
  public static void main(String[] args) {
    int[] test = {80,60,22,50,75}; // {}内の値の数だけ自動的に配列要素が確保される

    for (int i=0; i<5; i++) {
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です．");
    }
  }
}
