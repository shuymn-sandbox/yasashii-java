class ArrayVariable {
  public static void main(String[] args) {
    int[] test1; // 配列変数test1 (int[]型の変数)
    test1 = new int[3]; // newを使って要素を確保し，配列変数testに代入することで，配列を扱うことができるようになる

    System.out.println("test1を宣言しました．");
    System.out.println("配列要素を確保しました．");

    test1[0] = 80;
    test1[1] = 60;
    test1[2] = 22;

    int test2[]; //配列変数だけを用意．こういう書き方もできる
    System.out.println("test2を宣言しました．");

    test2 = test1; // 配列変数に代入
    System.out.println("test2にtest1を代入しました．");

    for (int i=0; i<3; i++)
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です．");

    for (int i=0; i<3; i++)
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です．");
  }
}
