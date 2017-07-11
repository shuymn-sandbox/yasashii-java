class DifferentLength {
  public static void main(String[] args) {
    int[][] test = {
      {80,60,22,50},{75,90,55,68},{72,58,63} // 各要素の数が揃っている必要はない
    };
    
    // test.length : 配列全体の長さ
    // test[i].length : 各配列要素の長さ
    for (int i=0; i<test.length; i++)
      System.out.println((i+1) + "番目の配列要素の長さは" + test[i].length + "です．");
  }
}
