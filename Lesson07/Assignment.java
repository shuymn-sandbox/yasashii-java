class Assignment {
  public static void main(String[] args) {
    int[] test1 = {80,60,22};
    System.out.println("test1を宣言して，配列要素を確保しました．");

    int[] test2 = test1;
    System.out.println("test2を宣言して，test2にtest1を代入しました．");

    for (int i=0; i<3; i++)
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です．");

    for (int i=0; i<3; i++)
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です．");

    test1[2] = 100; // test1を使って配列要素の値を1つ変更する
    System.out.println("test1がさす3番目の人の点数を変更しました．");

    for (int i=0; i<3; i++)
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です．");

    for (int i=0; i<3; i++)
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です．");
  }
}
