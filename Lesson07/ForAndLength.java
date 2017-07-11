class ForAndLength {
  public static void main(String[] args) {
    int[] test = {80,60,22,50,75};

    for (int i=0; i<test.length; i++) // 配列要素数を変更しても，コードの訂正が楽になる
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です．");

    System.out.println("テストの受験者は" + test.length + "人です．");
  }
}
