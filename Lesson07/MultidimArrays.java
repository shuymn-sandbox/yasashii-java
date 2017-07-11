class MultidimArrays {
  public static void main(String[] args) {
    int[][] test;
    test = new int[2][5]; // 科目数*人数分の配列を用意
    /* 他の書き方
       int[][] test = new test[2][5]; 一行で宣言と要素の確保
       int[][] test = {
         {80,60,22,50,75},{90,55,68,72,58} 初期化までやる
       }
     */

    test[0][0] = 80;
    test[0][1] = 60;
    test[0][2] = 22;
    test[0][3] = 50;
    test[0][4] = 75;
    test[1][0] = 90;
    test[1][1] = 55;
    test[1][2] = 68;
    test[1][3] = 72;
    test[1][4] = 58;

    for(int i=0; i<test[0].length; i++) {
      System.out.println((i+1) + "番目の人の英語の点数は" + test[0][i] + "です．");
      System.out.println((i+1) + "番目の人の数学の点数は" + test[1][i] + "です．");
    }
  }
}
